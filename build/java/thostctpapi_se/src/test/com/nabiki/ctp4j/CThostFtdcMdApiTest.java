package com.nabiki.ctp4j;

import org.junit.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

import static org.junit.Assert.fail;

public class CThostFtdcMdApiTest {
    private static final Logger logger = Logger.getLogger(CThostFtdcTraderApiTest.class.getName());

    static {
        System.loadLibrary("thostmduserapi_se");
        System.loadLibrary("thosttraderapi_se");
        System.loadLibrary("thostctpapi_se-6.3.19-P1");
    }

    class TestMdSpi extends CThostFtdcMdSpi {
        private final CThostFtdcMdApi api;

        private final String brokerID = "9999";
        private final String userID = "144287";
        private final String password = "chb_1987_1013";
        private final String appID = "3430491819";
        private final String authCode = "0000000000000000";
        private final String userProductInfo = "_trader_";

        private final Lock lock = new ReentrantLock();
        private final Condition cond = lock.newCondition();

        private int requestID = 0;

        TestMdSpi(CThostFtdcMdApi api) {
            this.api = api;
        }

        @Override
        public void OnFrontConnected() {
            logger.info("connected");
            signal();
        }

        @Override
        public void OnFrontDisconnected(int nReason) {
            logger.info("disconnected(" + nReason + ")");
        }

        @Override
        public void OnHeartBeatWarning(int nTimeLapse) {
            logger.info("heartbeat warning(" + nTimeLapse + ")");
        }

        @Override
        public void OnRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
            if (pRspInfo != null && pRspInfo.getErrorID() != 0)
                fail("login failed[" + pRspInfo.getErrorID() + "]: " + pRspInfo.getErrorMsg());
            signal();
        }

        @Override
        public void OnRspUserLogout(CThostFtdcUserLogoutField pUserLogout, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
            if (pRspInfo != null && pRspInfo.getErrorID() != 0)
                fail("logout failed[" + pRspInfo.getErrorID() + "]: " + pRspInfo.getErrorMsg());
            signal();
        }

        @Override
        public void OnRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
            if (pRspInfo == null)
                fail("rsp info null");
            fail("failed[" + pRspInfo.getErrorID() + "]: " + pRspInfo.getErrorMsg());
            signal();
        }

        @Override
        public void OnRspSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
            if (pRspInfo.getErrorID() != 0)
                fail("subscription failed");
            logger.info("sub rsp " + pSpecificInstrument.getInstrumentID());
            signal();
        }

        @Override
        public void OnRspUnSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
            if (pRspInfo.getErrorID() != 0)
                fail("subscription failed");
            logger.info("un-sub rsp " + pSpecificInstrument.getInstrumentID());
            signal();
        }

        @Override
        public void OnRtnDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData) {
            logger.info(pDepthMarketData.getInstrumentID() + ", " + pDepthMarketData.getUpdateTime());
        }

        int login() {
            var field = new CThostFtdcReqUserLoginField();
            field.setBrokerID(this.brokerID);
            field.setUserID(this.userID);
            field.setPassword(this.password);
            field.setUserProductInfo(this.userProductInfo);
            return this.api.ReqUserLogin(field, ++this.requestID);
        }

        int logout() {
            var field = new CThostFtdcUserLogoutField();
            field.setBrokerID(this.brokerID);
            field.setUserID(this.userID);
            return this.api.ReqUserLogout(field, ++this.requestID);
        }

        int subscribe(String instrumentID) {
            String[] req = new String[1];
            req[0] = instrumentID;
            return this.api.SubscribeMarketData(req, ++this.requestID);
        }

        int unSubscribe(String instrumentID) {
            String[] req = new String[1];
            req[0] = instrumentID;
            return this.api.UnSubscribeMarketData(req, ++this.requestID);
        }

        boolean waitRsp(long millis) {
            this.lock.lock();
            try {
                return this.cond.await(millis, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return false;
            } finally {
                this.lock.unlock();
            }
        }

        void signal() {
            this.lock.lock();
            try {
                this.cond.signal();
            } finally {
                this.lock.unlock();
            }
        }
    }

    private boolean waitMillis(int millis) {
        try {
            Thread.sleep(millis);
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
            fail("sleep interrupted");
            return false;
        }
    }


    @Test
    public void basic() {
        var api = CThostFtdcMdApi.CreateFtdcMdApi("md/");
        var spi = new TestMdSpi(api);

        boolean[] released = new boolean[1];
        released[0] = false;

        api.RegisterFront("tcp://180.168.146.187:10111");
        api.RegisterSpi(spi);
        api.Init();

        if (!spi.waitRsp(1000))
            fail("connect failed");

        waitMillis(1000);

        spi.login();
        if (!spi.waitRsp(1000))
            fail("login failed");

        spi.subscribe("c2101");
        if (!spi.waitRsp(1000))
            fail("sub timeout");

        waitMillis(30 * 1000);

        spi.unSubscribe("c2101");
        if (!spi.waitRsp(1000))
            fail("un-sub timeout");

        waitMillis(1000);

        new Thread(() -> {
            api.Join();
            released[0] = true;
        }).start();

        api.Release();

        // Wait release.
        waitMillis(1000);

        if (!released[0])
            fail("release time out");
    }
}