/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcBrokerWithdrawAlgorithmField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerWithdrawAlgorithmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerWithdrawAlgorithmField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcBrokerWithdrawAlgorithmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_BrokerID_get(swigCPtr, this);
  }

  public void setWithdrawAlgorithm(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_WithdrawAlgorithm_set(swigCPtr, this, value);
  }

  public char getWithdrawAlgorithm() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_WithdrawAlgorithm_get(swigCPtr, this);
  }

  public void setUsingRatio(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_UsingRatio_set(swigCPtr, this, value);
  }

  public double getUsingRatio() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_UsingRatio_get(swigCPtr, this);
  }

  public void setIncludeCloseProfit(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_IncludeCloseProfit_set(swigCPtr, this, value);
  }

  public char getIncludeCloseProfit() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_IncludeCloseProfit_get(swigCPtr, this);
  }

  public void setAllWithoutTrade(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_AllWithoutTrade_set(swigCPtr, this, value);
  }

  public char getAllWithoutTrade() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_AllWithoutTrade_get(swigCPtr, this);
  }

  public void setAvailIncludeCloseProfit(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_AvailIncludeCloseProfit_set(swigCPtr, this, value);
  }

  public char getAvailIncludeCloseProfit() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_AvailIncludeCloseProfit_get(swigCPtr, this);
  }

  public void setIsBrokerUserEvent(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_IsBrokerUserEvent_set(swigCPtr, this, value);
  }

  public int getIsBrokerUserEvent() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_IsBrokerUserEvent_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_CurrencyID_get(swigCPtr, this);
  }

  public void setFundMortgageRatio(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_FundMortgageRatio_set(swigCPtr, this, value);
  }

  public double getFundMortgageRatio() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_FundMortgageRatio_get(swigCPtr, this);
  }

  public void setBalanceAlgorithm(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_BalanceAlgorithm_set(swigCPtr, this, value);
  }

  public char getBalanceAlgorithm() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerWithdrawAlgorithmField_BalanceAlgorithm_get(swigCPtr, this);
  }

  public CThostFtdcBrokerWithdrawAlgorithmField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcBrokerWithdrawAlgorithmField(), true);
  }

}