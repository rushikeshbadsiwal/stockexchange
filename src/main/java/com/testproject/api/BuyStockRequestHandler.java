package com.testproject.api;

import com.testproject.model.StockBuyRequest;
import com.testproject.model.StockBuyResponse;
import com.testproject.service.BuyStockService;

import javax.inject.Singleton;
import java.util.concurrent.*;

@Singleton
public class BuyStockRequestHandler implements EventHandler<StockBuyRequest, StockBuyResponse> {

    private ExecutorService executor;
    private BuyStockService buyStockService;

    public BuyStockRequestHandler(ExecutorService executor, BuyStockService buyStockService) {
        this.executor = executor;
        this.buyStockService = buyStockService;
    }

    @Override
    public CompletableFuture<StockBuyResponse> process(StockBuyRequest request) {
        CompletableFuture.supplyAsync(() -> {
            return buyStockService.buyStock(request);
        }, executor);
        return null;
    }
}
