/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcOptionInstrCommRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcOptionInstrCommRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOptionInstrCommRateField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcOptionInstrCommRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_InvestorID_get(swigCPtr, this);
  }

  public void setOpenRatioByMoney(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_OpenRatioByMoney_set(swigCPtr, this, value);
  }

  public double getOpenRatioByMoney() {
    return ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_OpenRatioByMoney_get(swigCPtr, this);
  }

  public void setOpenRatioByVolume(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_OpenRatioByVolume_set(swigCPtr, this, value);
  }

  public double getOpenRatioByVolume() {
    return ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_OpenRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseRatioByMoney(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_CloseRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseRatioByMoney() {
    return ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_CloseRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseRatioByVolume(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_CloseRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseRatioByVolume() {
    return ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_CloseRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByMoney(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_CloseTodayRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByMoney() {
    return ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_CloseTodayRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByVolume(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_CloseTodayRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByVolume() {
    return ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_CloseTodayRatioByVolume_get(swigCPtr, this);
  }

  public void setStrikeRatioByMoney(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_StrikeRatioByMoney_set(swigCPtr, this, value);
  }

  public double getStrikeRatioByMoney() {
    return ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_StrikeRatioByMoney_get(swigCPtr, this);
  }

  public void setStrikeRatioByVolume(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_StrikeRatioByVolume_set(swigCPtr, this, value);
  }

  public double getStrikeRatioByVolume() {
    return ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_StrikeRatioByVolume_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostFtdcCtpApiJNI.CThostFtdcOptionInstrCommRateField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcOptionInstrCommRateField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcOptionInstrCommRateField(), true);
  }

}
