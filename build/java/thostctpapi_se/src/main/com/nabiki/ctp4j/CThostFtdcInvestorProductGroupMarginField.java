/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcInvestorProductGroupMarginField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInvestorProductGroupMarginField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestorProductGroupMarginField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcInvestorProductGroupMarginField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProductGroupID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ProductGroupID_set(swigCPtr, this, value);
  }

  public String getProductGroupID() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ProductGroupID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_InvestorID_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_SettlementID_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenMargin_get(swigCPtr, this);
  }

  public void setLongFrozenMargin(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_LongFrozenMargin_set(swigCPtr, this, value);
  }

  public double getLongFrozenMargin() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_LongFrozenMargin_get(swigCPtr, this);
  }

  public void setShortFrozenMargin(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ShortFrozenMargin_set(swigCPtr, this, value);
  }

  public double getShortFrozenMargin() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ShortFrozenMargin_get(swigCPtr, this);
  }

  public void setUseMargin(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_UseMargin_set(swigCPtr, this, value);
  }

  public double getUseMargin() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_UseMargin_get(swigCPtr, this);
  }

  public void setLongUseMargin(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_LongUseMargin_set(swigCPtr, this, value);
  }

  public double getLongUseMargin() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_LongUseMargin_get(swigCPtr, this);
  }

  public void setShortUseMargin(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ShortUseMargin_set(swigCPtr, this, value);
  }

  public double getShortUseMargin() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ShortUseMargin_get(swigCPtr, this);
  }

  public void setExchMargin(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ExchMargin_set(swigCPtr, this, value);
  }

  public double getExchMargin() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ExchMargin_get(swigCPtr, this);
  }

  public void setLongExchMargin(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_LongExchMargin_set(swigCPtr, this, value);
  }

  public double getLongExchMargin() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_LongExchMargin_get(swigCPtr, this);
  }

  public void setShortExchMargin(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ShortExchMargin_set(swigCPtr, this, value);
  }

  public double getShortExchMargin() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ShortExchMargin_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_CloseProfit_get(swigCPtr, this);
  }

  public void setFrozenCommission(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenCommission_set(swigCPtr, this, value);
  }

  public double getFrozenCommission() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenCommission_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_Commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_Commission_get(swigCPtr, this);
  }

  public void setFrozenCash(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenCash_set(swigCPtr, this, value);
  }

  public double getFrozenCash() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenCash_get(swigCPtr, this);
  }

  public void setCashIn(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_CashIn_set(swigCPtr, this, value);
  }

  public double getCashIn() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_CashIn_get(swigCPtr, this);
  }

  public void setPositionProfit(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_PositionProfit_set(swigCPtr, this, value);
  }

  public double getPositionProfit() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_PositionProfit_get(swigCPtr, this);
  }

  public void setOffsetAmount(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_OffsetAmount_set(swigCPtr, this, value);
  }

  public double getOffsetAmount() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_OffsetAmount_get(swigCPtr, this);
  }

  public void setLongOffsetAmount(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_LongOffsetAmount_set(swigCPtr, this, value);
  }

  public double getLongOffsetAmount() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_LongOffsetAmount_get(swigCPtr, this);
  }

  public void setShortOffsetAmount(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ShortOffsetAmount_set(swigCPtr, this, value);
  }

  public double getShortOffsetAmount() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ShortOffsetAmount_get(swigCPtr, this);
  }

  public void setExchOffsetAmount(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ExchOffsetAmount_set(swigCPtr, this, value);
  }

  public double getExchOffsetAmount() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ExchOffsetAmount_get(swigCPtr, this);
  }

  public void setLongExchOffsetAmount(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_LongExchOffsetAmount_set(swigCPtr, this, value);
  }

  public double getLongExchOffsetAmount() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_LongExchOffsetAmount_get(swigCPtr, this);
  }

  public void setShortExchOffsetAmount(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ShortExchOffsetAmount_set(swigCPtr, this, value);
  }

  public double getShortExchOffsetAmount() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ShortExchOffsetAmount_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_HedgeFlag_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostFtdcCtpApiJNI.CThostFtdcInvestorProductGroupMarginField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcInvestorProductGroupMarginField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcInvestorProductGroupMarginField(), true);
  }

}