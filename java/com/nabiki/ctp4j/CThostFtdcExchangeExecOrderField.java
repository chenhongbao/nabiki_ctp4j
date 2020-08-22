/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcExchangeExecOrderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeExecOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeExecOrderField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcExchangeExecOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVolume(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_Volume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionType(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ActionType_set(swigCPtr, this, value);
  }

  public char getActionType() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ActionType_get(swigCPtr, this);
  }

  public void setPosiDirection(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_PosiDirection_set(swigCPtr, this, value);
  }

  public char getPosiDirection() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_PosiDirection_get(swigCPtr, this);
  }

  public void setReservePositionFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ReservePositionFlag_set(swigCPtr, this, value);
  }

  public char getReservePositionFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ReservePositionFlag_get(swigCPtr, this);
  }

  public void setCloseFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_CloseFlag_set(swigCPtr, this, value);
  }

  public char getCloseFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_CloseFlag_get(swigCPtr, this);
  }

  public void setExecOrderLocalID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ExecOrderLocalID_set(swigCPtr, this, value);
  }

  public String getExecOrderLocalID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ExecOrderLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_SettlementID_get(swigCPtr, this);
  }

  public void setExecOrderSysID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ExecOrderSysID_set(swigCPtr, this, value);
  }

  public String getExecOrderSysID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ExecOrderSysID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_InsertTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_CancelTime_get(swigCPtr, this);
  }

  public void setExecResult(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ExecResult_set(swigCPtr, this, value);
  }

  public char getExecResult() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ExecResult_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_SequenceNo_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_BranchID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeExecOrderField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeExecOrderField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcExchangeExecOrderField(), true);
  }

}
