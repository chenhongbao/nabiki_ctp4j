package com.nabiki.ctp4j;

import org.junit.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

import static org.junit.Assert.fail;

public class CThostFtdcTraderApiTest {

    private static final Logger logger = Logger.getLogger(CThostFtdcTraderApiTest.class.getName());

    static {
        System.loadLibrary("thostmduserapi_se");
        System.loadLibrary("thosttraderapi_se");
        System.loadLibrary("thostctpapi_se-6.3.19-P1");
    }

    private class TraderTestSpi extends CThostFtdcTraderSpi {
        private final CThostFtdcTraderApi api;

        private final String brokerID = "9999";
        private final String userID = "144287";
        private final String password = "chb_1987_1013";
        private final String appID = "3430491819";
        private final String authCode = "0000000000000000";
        private final String userProductInfo = "_trader_";

        private final Lock lock = new ReentrantLock();
        private final Condition cond = lock.newCondition();

        private int requestID = 0;

        TraderTestSpi(CThostFtdcTraderApi api) {
            this.api = api;
        }

        @Override
        public void OnFrontConnected() {
            logger.info("connected");
            signal();
        }

        @Override
        public void OnFrontDisconnected(int nReason) {
            logger.info("disconnected[" + nReason + "]");
        }

        @Override
        public void OnRspAuthenticate(CThostFtdcRspAuthenticateField pRspAuthenticateField, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
            if (pRspInfo != null && pRspInfo.getErrorID() != 0)
                fail("authenticate failed[" + pRspInfo.getErrorID() + "]: " + pRspInfo.getErrorMsg());
            signal();
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
        public void OnRspQrySettlementInfo(CThostFtdcSettlementInfoField pSettlementInfo, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
            if (pRspInfo != null && pRspInfo.getErrorID() != 0)
                fail("qry settlement failed[" + pRspInfo.getErrorID() + "]: " + pRspInfo.getErrorMsg());
            else if (pSettlementInfo != null)
                System.out.print(pSettlementInfo.getContent());
            else
                System.out.println("settlement info null");
            signal();
        }

        @Override
        public void OnRspSettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
            if (pRspInfo != null && pRspInfo.getErrorID() != 0)
                fail("confirm settlement failed[" + pRspInfo.getErrorID() + "]: " + pRspInfo.getErrorMsg());
            signal();
        }

        @Override
        public void OnRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
            if (pRspInfo == null)
                fail("rsp info null");
            fail("failed[" + pRspInfo.getErrorID() + "]: " + pRspInfo.getErrorMsg());
            signal();
        }

        int authenticate() {
            var field = new CThostFtdcReqAuthenticateField();
            field.setBrokerID(this.brokerID);
            field.setUserID(this.userID);
            field.setAppID(this.appID);
            field.setAuthCode(this.authCode);
            field.setUserProductInfo(this.userProductInfo);
            return this.api.ReqAuthenticate(field, ++this.requestID);
        }

        int login() {
            var field = new CThostFtdcReqUserLoginField();
            field.setBrokerID(this.brokerID);
            field.setUserID(this.userID);
            field.setPassword(this.password);
            field.setUserProductInfo(this.userProductInfo);
            return this.api.ReqUserLogin(field, ++this.requestID);
        }

        int qry_settlement() {
            var qry = new CThostFtdcQrySettlementInfoField();
            qry.setAccountID(this.userID);
            qry.setInvestorID(this.userID);
            qry.setBrokerID(this.brokerID);
            qry.setCurrencyID("CNY");
            qry.setTradingDay("20200824");
            return this.api.ReqQrySettlementInfo(qry, ++this.requestID);
        }

        int confirm() {
            var field = new CThostFtdcSettlementInfoConfirmField();
            field.setBrokerID(this.brokerID);
            field.setInvestorID(this.userID);
            field.setAccountID(this.userID);
            field.setCurrencyID("CNY");
            return this.api.ReqSettlementInfoConfirm(field, ++this.requestID);
        }

        int logout() {
            var field = new CThostFtdcUserLogoutField();
            field.setBrokerID(this.brokerID);
            field.setUserID(this.userID);
            return this.api.ReqUserLogout(field, ++this.requestID);
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
        var api = CThostFtdcTraderApi.CreateFtdcTraderApi(".trade/");
        var spi = new TraderTestSpi(api);

        boolean[] released = new boolean[1];
        released[0] = false;

        api.RegisterFront("tcp://180.168.146.187:10101");
        api.RegisterSpi(spi);
        api.SubscribePrivateTopic(THOST_TE_RESUME_TYPE.THOST_TERT_RESUME);
        api.SubscribePublicTopic(THOST_TE_RESUME_TYPE.THOST_TERT_RESUME);
        api.Init();

        if (!spi.waitRsp(1000))
            fail("connect time out");

        waitMillis(30 * 1000);

        spi.authenticate();
        if (!spi.waitRsp(1000))
            fail("authenticate time out");

        spi.login();
        if (!spi.waitRsp(1000))
            fail("login time out");

        spi.qry_settlement();
        if (!spi.waitRsp(1000))
            fail("qry settlement time out");

        spi.confirm();
        if (!spi.waitRsp(1000))
            fail("confirm settlement time out");

        spi.logout();
        if (!spi.waitRsp(1000))
            fail("logout time out");

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