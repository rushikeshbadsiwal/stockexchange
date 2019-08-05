package com.testproject.service;

import com.testproject.dao.BuyStockRecordDao;
import com.testproject.model.Request;
import com.testproject.model.StockBuyRequest;

import java.util.List;
import java.util.UUID;

public class BuyStockRecordService {

    BuyStockRecordDao buyStockRecordDao;

    public List<Request> getAllBuyStockRecord() {
        return buyStockRecordDao.getAllBuyStockRecord();
    }

    public String addBuyStockRecord(StockBuyRequest stockBuyRequest) {
        return buyStockRecordDao.addBuyStockRecord(stockBuyRequest);
    }

    public String deleteBuyStockRecord(UUID eventID) {
        return buyStockRecordDao.deleteBuyStockRecord(eventID);
    }

    public Request getBuyStockRecord(UUID eventID) {
        return buyStockRecordDao.getBuyStockRecord(eventID);
    }

    public String updateBuyStockRecord(StockBuyRequest stockBuyRequest) {
        return buyStockRecordDao.updateBuyStockRecord(stockBuyRequest);
    }
}
