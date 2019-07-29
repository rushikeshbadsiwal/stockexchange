package com.testproject.api;

import com.testproject.model.StockBuyRequest;
import com.testproject.model.StockBuyResponse;

public class BuyStockRequestHandler implements StockExchangeEventHandler<StockBuyRequest, StockBuyResponse> {

    @Override
    public StockBuyResponse process(StockBuyRequest request) {
        return null;
    }

    @Override
    public void createRecord() {

    }

    @Override
    public void storeRecord() {

    }
}
