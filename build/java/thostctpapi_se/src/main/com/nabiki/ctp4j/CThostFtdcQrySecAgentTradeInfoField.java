/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcQrySecAgentTradeInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQrySecAgentTradeInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQrySecAgentTradeInfoField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcQrySecAgentTradeInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQrySecAgentTradeInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQrySecAgentTradeInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerSecAgentID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQrySecAgentTradeInfoField_BrokerSecAgentID_set(swigCPtr, this, value);
  }

  public String getBrokerSecAgentID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQrySecAgentTradeInfoField_BrokerSecAgentID_get(swigCPtr, this);
  }

  public CThostFtdcQrySecAgentTradeInfoField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcQrySecAgentTradeInfoField(), true);
  }

}
