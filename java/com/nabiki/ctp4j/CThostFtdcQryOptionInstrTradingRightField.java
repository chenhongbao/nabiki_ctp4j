/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcQryOptionInstrTradingRightField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryOptionInstrTradingRightField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryOptionInstrTradingRightField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcQryOptionInstrTradingRightField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryOptionInstrTradingRightField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryOptionInstrTradingRightField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryOptionInstrTradingRightField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryOptionInstrTradingRightField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryOptionInstrTradingRightField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryOptionInstrTradingRightField_InstrumentID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryOptionInstrTradingRightField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryOptionInstrTradingRightField_Direction_get(swigCPtr, this);
  }

  public CThostFtdcQryOptionInstrTradingRightField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcQryOptionInstrTradingRightField(), true);
  }

}
