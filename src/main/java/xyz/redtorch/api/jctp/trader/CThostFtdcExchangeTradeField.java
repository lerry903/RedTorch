/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcExchangeTradeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeTradeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeTradeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcExchangeTradeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_ExchangeID_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_TradeID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_Direction_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_OrderSysID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_ClientID_get(swigCPtr, this);
  }

  public void setTradingRole(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_TradingRole_set(swigCPtr, this, value);
  }

  public char getTradingRole() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_TradingRole_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_HedgeFlag_get(swigCPtr, this);
  }

  public void setPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_Price_set(swigCPtr, this, value);
  }

  public double getPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_Price_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_Volume_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeType(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_TradeType_set(swigCPtr, this, value);
  }

  public char getTradeType() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_TradeType_get(swigCPtr, this);
  }

  public void setPriceSource(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_PriceSource_set(swigCPtr, this, value);
  }

  public char getPriceSource() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_PriceSource_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_TraderID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_OrderLocalID_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_ClearingPartID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_BusinessUnit_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_SequenceNo_get(swigCPtr, this);
  }

  public void setTradeSource(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_TradeSource_set(swigCPtr, this, value);
  }

  public char getTradeSource() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeTradeField_TradeSource_get(swigCPtr, this);
  }

  public CThostFtdcExchangeTradeField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcExchangeTradeField(), true);
  }

}
