/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcTransferBankToFutureReqField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferBankToFutureReqField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferBankToFutureReqField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostFtdcCtpApiJNI.delete_CThostFtdcTransferBankToFutureReqField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFutureAccount(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureReqField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureReqField_FutureAccount_get(swigCPtr, this);
  }

  public void setFuturePwdFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureReqField_FuturePwdFlag_set(swigCPtr, this, value);
  }

  public char getFuturePwdFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureReqField_FuturePwdFlag_get(swigCPtr, this);
  }

  public void setFutureAccPwd(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureReqField_FutureAccPwd_set(swigCPtr, this, value);
  }

  public String getFutureAccPwd() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureReqField_FutureAccPwd_get(swigCPtr, this);
  }

  public void setTradeAmt(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureReqField_TradeAmt_set(swigCPtr, this, value);
  }

  public double getTradeAmt() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureReqField_TradeAmt_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureReqField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureReqField_CustFee_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureReqField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureReqField_CurrencyCode_get(swigCPtr, this);
  }

  public CThostFtdcTransferBankToFutureReqField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcTransferBankToFutureReqField(), true);
  }

}
