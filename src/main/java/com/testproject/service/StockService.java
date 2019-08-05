package com.testproject.service;

import com.testproject.dao.StockDao;
import com.testproject.model.StockDetail;

import java.util.List;

public class StockService {
    StockDao stockdao;

    public List<StockDetail> getAllStocks() {
        return stockdao.getAllStocks();
    }

    public String addStock(StockDetail stockDetail) {
        return stockdao.addStock(stockDetail);
    }

    public String deleteStock(String symbol) {
        return stockdao.deleteStock(symbol);
    }

    public StockDetail getStock(String symbol) {
        return stockdao.getStock(symbol);
    }

    public String updateStockCount(StockDetail stockDetail) {
        return stockdao.updateStockCount(stockDetail);
    }

    public String updateStockPrice(StockDetail stockDetail) {
        return stockdao.updateStockPrice(stockDetail);
    }
}
