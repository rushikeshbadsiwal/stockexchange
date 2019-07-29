package com.testproject.api;

public interface StockExchangeEventHandler extends EventHandler{

    void createRecord();

    void storeRecord();
}
