/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcForQuoteRspField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcForQuoteRspField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcForQuoteRspField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcForQuoteRspField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcForQuoteRspField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcForQuoteRspField_TradingDay_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcForQuoteRspField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcForQuoteRspField_InstrumentID_get(swigCPtr, this);
  }

  public void setForQuoteSysID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcForQuoteRspField_ForQuoteSysID_set(swigCPtr, this, value);
  }

  public String getForQuoteSysID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcForQuoteRspField_ForQuoteSysID_get(swigCPtr, this);
  }

  public void setForQuoteTime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcForQuoteRspField_ForQuoteTime_set(swigCPtr, this, value);
  }

  public String getForQuoteTime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcForQuoteRspField_ForQuoteTime_get(swigCPtr, this);
  }

  public void setActionDay(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcForQuoteRspField_ActionDay_set(swigCPtr, this, value);
  }

  public String getActionDay() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcForQuoteRspField_ActionDay_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcForQuoteRspField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcForQuoteRspField_ExchangeID_get(swigCPtr, this);
  }

  public CThostFtdcForQuoteRspField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcForQuoteRspField(), true);
  }

}
