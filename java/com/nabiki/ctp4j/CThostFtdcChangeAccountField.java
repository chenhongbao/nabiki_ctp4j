/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcChangeAccountField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcChangeAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcChangeAccountField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcChangeAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setGender(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_Gender_set(swigCPtr, this, value);
  }

  public char getGender() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_Gender_get(swigCPtr, this);
  }

  public void setCountryCode(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_CountryCode_set(swigCPtr, this, value);
  }

  public String getCountryCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_CountryCode_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_CustType_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_ZipCode_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_Telephone_get(swigCPtr, this);
  }

  public void setMobilePhone(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_MobilePhone_set(swigCPtr, this, value);
  }

  public String getMobilePhone() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_MobilePhone_get(swigCPtr, this);
  }

  public void setFax(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_Fax_set(swigCPtr, this, value);
  }

  public String getFax() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_Fax_get(swigCPtr, this);
  }

  public void setEMail(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_EMail_set(swigCPtr, this, value);
  }

  public String getEMail() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_EMail_get(swigCPtr, this);
  }

  public void setMoneyAccountStatus(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_MoneyAccountStatus_set(swigCPtr, this, value);
  }

  public char getMoneyAccountStatus() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_MoneyAccountStatus_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setNewBankAccount(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_NewBankAccount_set(swigCPtr, this, value);
  }

  public String getNewBankAccount() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_NewBankAccount_get(swigCPtr, this);
  }

  public void setNewBankPassWord(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_NewBankPassWord_set(swigCPtr, this, value);
  }

  public String getNewBankPassWord() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_NewBankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_Password_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_InstallID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setTID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_TID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_Digest_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_ErrorMsg_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return ThostFtdcCtpApiJNI.CThostFtdcChangeAccountField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcChangeAccountField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcChangeAccountField(), true);
  }

}
