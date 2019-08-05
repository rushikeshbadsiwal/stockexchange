package com.testproject.controller;

import com.testproject.model.StockDetail;
import com.testproject.service.StockService;

import java.util.List;

public class StockController {
    StockService stockService;

    public List<StockDetail> getAllStocks() {
        return stockService.getAllStocks();
    }

    public String addStock(StockDetail stockDetail) {
        return stockService.addStock(stockDetail);
    }

    public String deleteStock(String symbol) {
        return stockService.deleteStock(symbol);
    }

    public StockDetail getStock(String symbol) {
        return stockService.getStock(symbol);
    }

    public String updateStockCount(StockDetail stockDetail) {
        return stockService.updateStockCount(stockDetail);
    }

    public String updateStockPrice(StockDetail stockDetail) {
        return stockService.updateStockPrice(stockDetail);
    }
}
