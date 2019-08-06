package com.testproject.service;

import com.testproject.dao.BuyStockRecordDao;
import com.testproject.dao.StockDao;
import com.testproject.model.StockBuyRequest;
import com.testproject.model.StockBuyResponse;
import com.testproject.model.StockDetail;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BuyStockService {

    private ExecutorService executor = Executors.newFixedThreadPool(1);
    private StockDao stockDao = new StockDao();
    private BuyStockRecordDao buyStockRecordDao = new BuyStockRecordDao();

    public CompletableFuture<StockBuyResponse> buyStock(StockBuyRequest request) {
        return CompletableFuture.supplyAsync(() -> {

            StockDetail availableStock = stockDao.getStock(request.getStockDetail().getSymbol());
            if (availableStock.getCount() < request.getStockDetail().getCount()) {
                StockBuyResponse response = makeStockBuyfailureResponse(request);
                response.setMaxPossibleBuy(availableStock.getCount());
                return response;
            }
            availableStock.setCount(availableStock.getCount() - request.getStockDetail().getCount());
            stockDao.updateStockCount(availableStock);
            buyStockRecordDao.addBuyStockRecord(request);
            return new StockBuyResponse();
        }, executor);
    }

    private StockBuyResponse makeStockBuyfailureResponse(StockBuyRequest stockBuyRequest){
        return new StockBuyResponse(stockBuyRequest);
    }

}
