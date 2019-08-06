package com.testproject.controller;

import com.testproject.api.BuyStockRequestHandler;
import com.testproject.model.StockBuyRequest;

import java.util.concurrent.Executors;

public class BuyStockController {

    private BuyStockRequestHandler buyStockRequestHandler = new BuyStockRequestHandler();

    public void stockBuy(StockBuyRequest stockBuyRequest){
        buyStockRequestHandler.process(stockBuyRequest);
    }
}
