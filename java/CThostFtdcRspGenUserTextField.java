/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcRspGenUserTextField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspGenUserTextField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspGenUserTextField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcRspGenUserTextField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUserTextSeq(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcRspGenUserTextField_UserTextSeq_set(swigCPtr, this, value);
  }

  public int getUserTextSeq() {
    return ThostFtdcCtpApiJNI.CThostFtdcRspGenUserTextField_UserTextSeq_get(swigCPtr, this);
  }

  public CThostFtdcRspGenUserTextField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcRspGenUserTextField(), true);
  }

}