package com.testproject.api;

import com.testproject.model.StockSellRequest;
import com.testproject.model.StockSellResponse;

public class SellStockRequestHandler implements StockExchangeEventHandler<StockSellRequest, StockSellResponse> {

    @Override
    public void createRecord() {

    }

    @Override
    public void storeRecord() {

    }

    @Override
    public StockSellResponse process(StockSellRequest request) {
        return null;
    }
}
