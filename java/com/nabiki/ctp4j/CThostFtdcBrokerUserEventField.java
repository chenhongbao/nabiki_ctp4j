/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcBrokerUserEventField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerUserEventField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerUserEventField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcBrokerUserEventField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_UserID_get(swigCPtr, this);
  }

  public void setUserEventType(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_UserEventType_set(swigCPtr, this, value);
  }

  public char getUserEventType() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_UserEventType_get(swigCPtr, this);
  }

  public void setEventSequenceNo(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_EventSequenceNo_set(swigCPtr, this, value);
  }

  public int getEventSequenceNo() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_EventSequenceNo_get(swigCPtr, this);
  }

  public void setEventDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_EventDate_set(swigCPtr, this, value);
  }

  public String getEventDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_EventDate_get(swigCPtr, this);
  }

  public void setEventTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_EventTime_set(swigCPtr, this, value);
  }

  public String getEventTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_EventTime_get(swigCPtr, this);
  }

  public void setUserEventInfo(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_UserEventInfo_set(swigCPtr, this, value);
  }

  public String getUserEventInfo() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_UserEventInfo_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerUserEventField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserEventField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcBrokerUserEventField(), true);
  }

}
