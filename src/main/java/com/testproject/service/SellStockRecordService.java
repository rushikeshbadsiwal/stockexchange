package com.testproject.service;

import com.testproject.model.Request;
import com.testproject.model.StockSellRequest;

import java.util.List;
import java.util.UUID;

public class SellStockRecordService {

    com.testproject.dao.SellStockRecordDao SellStockRecordDao;

    public List<Request> getAllSellStockRecord() {
        return SellStockRecordDao.getAllSellStockRecord();
    }

    public String addSellStockRecord(StockSellRequest stockSellRequest) {
        return SellStockRecordDao.addSellStockRecord(stockSellRequest);
    }

    public String deleteSellStockRecord(UUID eventID) {
        return SellStockRecordDao.deleteSellStockRecord(eventID);
    }

    public Request getSellStockRecord(UUID eventID) {
        return SellStockRecordDao.getSellStockRecord(eventID);
    }

    public String updateSellStockRecord(StockSellRequest stockSellRequest) {
        return SellStockRecordDao.updateSellStockRecord(stockSellRequest);
    }
}

