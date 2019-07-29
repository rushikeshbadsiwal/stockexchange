package com.testproject.api;

import com.testproject.model.Request;
import com.testproject.model.Response;

public interface StockExchangeEventHandler<A extends Request, B extends Response> extends EventHandler<A, B>{

    void createRecord();

    void storeRecord();
}
