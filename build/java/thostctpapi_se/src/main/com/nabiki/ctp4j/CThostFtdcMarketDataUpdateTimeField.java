/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcMarketDataUpdateTimeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarketDataUpdateTimeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataUpdateTimeField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcMarketDataUpdateTimeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcMarketDataUpdateTimeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostFtdcCtpApiJNI.CThostFtdcMarketDataUpdateTimeField_InstrumentID_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcMarketDataUpdateTimeField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcMarketDataUpdateTimeField_UpdateTime_get(swigCPtr, this);
  }

  public void setUpdateMillisec(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcMarketDataUpdateTimeField_UpdateMillisec_set(swigCPtr, this, value);
  }

  public int getUpdateMillisec() {
    return ThostFtdcCtpApiJNI.CThostFtdcMarketDataUpdateTimeField_UpdateMillisec_get(swigCPtr, this);
  }

  public void setActionDay(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcMarketDataUpdateTimeField_ActionDay_set(swigCPtr, this, value);
  }

  public String getActionDay() {
    return ThostFtdcCtpApiJNI.CThostFtdcMarketDataUpdateTimeField_ActionDay_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataUpdateTimeField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcMarketDataUpdateTimeField(), true);
  }

}