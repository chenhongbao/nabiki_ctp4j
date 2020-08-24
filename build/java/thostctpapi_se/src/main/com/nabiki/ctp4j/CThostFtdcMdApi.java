/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcMdApi {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;
  protected CThostFtdcMdSpi jSpi;

  protected CThostFtdcMdApi(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMdApi obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  public static CThostFtdcMdApi CreateFtdcMdApi(String pszFlowPath, boolean bIsUsingUdp, boolean bIsMulticast) {
    synchronized (ThostFtdcCtpApi.syncObj) {
      long cPtr = ThostFtdcCtpApiJNI.CThostFtdcMdApi_CreateFtdcMdApi__SWIG_0(pszFlowPath, bIsUsingUdp, bIsMulticast);
      return (cPtr == 0) ? null : new CThostFtdcMdApi(cPtr, false);
    }
  }

  public static CThostFtdcMdApi CreateFtdcMdApi(String pszFlowPath, boolean bIsUsingUdp) {
	synchronized (ThostFtdcCtpApi.syncObj) {
      long cPtr = ThostFtdcCtpApiJNI.CThostFtdcMdApi_CreateFtdcMdApi__SWIG_1(pszFlowPath, bIsUsingUdp);
      return (cPtr == 0) ? null : new CThostFtdcMdApi(cPtr, false);
	}
  }

  public static CThostFtdcMdApi CreateFtdcMdApi(String pszFlowPath) {
    synchronized (ThostFtdcCtpApi.syncObj) {
	  long cPtr = ThostFtdcCtpApiJNI.CThostFtdcMdApi_CreateFtdcMdApi__SWIG_2(pszFlowPath);
      return (cPtr == 0) ? null : new CThostFtdcMdApi(cPtr, false);
	}
  }

  public static CThostFtdcMdApi CreateFtdcMdApi() {
    synchronized (ThostFtdcCtpApi.syncObj) {
	  long cPtr = ThostFtdcCtpApiJNI.CThostFtdcMdApi_CreateFtdcMdApi__SWIG_3();
      return (cPtr == 0) ? null : new CThostFtdcMdApi(cPtr, false);
	}
  }

  public static String GetApiVersion() {
    synchronized (ThostFtdcCtpApi.syncObj) {
	  return ThostFtdcCtpApiJNI.CThostFtdcMdApi_GetApiVersion();
	}
  }

  public void Release() {
    synchronized (ThostFtdcCtpApi.syncObj) {
	  this.jSpi = null;
	  ThostFtdcCtpApiJNI.CThostFtdcMdApi_Release(swigCPtr, this);
	}
  }

  public void Init() {
    synchronized (ThostFtdcCtpApi.syncObj) {
	  ThostFtdcCtpApiJNI.CThostFtdcMdApi_Init(swigCPtr, this);
	}
  }

  public int Join() {
    synchronized (ThostFtdcCtpApi.syncObj) {
	  return ThostFtdcCtpApiJNI.CThostFtdcMdApi_Join(swigCPtr, this);
	}
  }

  public String GetTradingDay() {
    synchronized (ThostFtdcCtpApi.syncObj) {
	  return ThostFtdcCtpApiJNI.CThostFtdcMdApi_GetTradingDay(swigCPtr, this);
	}
  }

  public void RegisterFront(String pszFrontAddress) {
    synchronized (ThostFtdcCtpApi.syncObj) {
	  ThostFtdcCtpApiJNI.CThostFtdcMdApi_RegisterFront(swigCPtr, this, pszFrontAddress);
	}
  }

  public void RegisterNameServer(String pszNsAddress) {
    synchronized (ThostFtdcCtpApi.syncObj) {
	  ThostFtdcCtpApiJNI.CThostFtdcMdApi_RegisterNameServer(swigCPtr, this, pszNsAddress);
	}
  }

  public void RegisterFensUserInfo(CThostFtdcFensUserInfoField pFensUserInfo) {
    synchronized (ThostFtdcCtpApi.syncObj) {
	  ThostFtdcCtpApiJNI.CThostFtdcMdApi_RegisterFensUserInfo(swigCPtr, this, CThostFtdcFensUserInfoField.getCPtr(pFensUserInfo), pFensUserInfo);
	}
  }

  public void RegisterSpi(CThostFtdcMdSpi pSpi) {
    synchronized (ThostFtdcCtpApi.syncObj) {
      this.jSpi = pSpi;
	  ThostFtdcCtpApiJNI.CThostFtdcMdApi_RegisterSpi(swigCPtr, this, CThostFtdcMdSpi.getCPtr(pSpi), pSpi);
	}
  }

  public int SubscribeMarketData(String[] ppInstrumentID, int nCount) {
    synchronized (ThostFtdcCtpApi.syncObj) {
	  return ThostFtdcCtpApiJNI.CThostFtdcMdApi_SubscribeMarketData(swigCPtr, this, ppInstrumentID, nCount);
	}
  }

  public int UnSubscribeMarketData(String[] ppInstrumentID, int nCount) {
    synchronized (ThostFtdcCtpApi.syncObj) {
	  return ThostFtdcCtpApiJNI.CThostFtdcMdApi_UnSubscribeMarketData(swigCPtr, this, ppInstrumentID, nCount);
	}
  }

  public int SubscribeForQuoteRsp(String[] ppInstrumentID, int nCount) {
    synchronized (ThostFtdcCtpApi.syncObj) {
	  return ThostFtdcCtpApiJNI.CThostFtdcMdApi_SubscribeForQuoteRsp(swigCPtr, this, ppInstrumentID, nCount);
	}
  }

  public int UnSubscribeForQuoteRsp(String[] ppInstrumentID, int nCount) {
    synchronized (ThostFtdcCtpApi.syncObj) {
	  return ThostFtdcCtpApiJNI.CThostFtdcMdApi_UnSubscribeForQuoteRsp(swigCPtr, this, ppInstrumentID, nCount);
	}
  }

  public int ReqUserLogin(CThostFtdcReqUserLoginField pReqUserLoginField, int nRequestID) {
    synchronized (ThostFtdcCtpApi.syncObj) {
	  return ThostFtdcCtpApiJNI.CThostFtdcMdApi_ReqUserLogin(swigCPtr, this, CThostFtdcReqUserLoginField.getCPtr(pReqUserLoginField), pReqUserLoginField, nRequestID);
	}
  }

  public int ReqUserLogout(CThostFtdcUserLogoutField pUserLogout, int nRequestID) {
    synchronized (ThostFtdcCtpApi.syncObj) {
	  return ThostFtdcCtpApiJNI.CThostFtdcMdApi_ReqUserLogout(swigCPtr, this, CThostFtdcUserLogoutField.getCPtr(pUserLogout), pUserLogout, nRequestID);
	}
  }

  public int ReqQryMulticastInstrument(CThostFtdcQryMulticastInstrumentField pQryMulticastInstrument, int nRequestID) {
    synchronized (ThostFtdcCtpApi.syncObj) {
	  return ThostFtdcCtpApiJNI.CThostFtdcMdApi_ReqQryMulticastInstrument(swigCPtr, this, CThostFtdcQryMulticastInstrumentField.getCPtr(pQryMulticastInstrument), pQryMulticastInstrument, nRequestID);
	}
  }

}
