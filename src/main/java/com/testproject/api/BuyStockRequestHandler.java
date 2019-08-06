package com.testproject.api;

import com.testproject.exceptionHandlers.InvalidRequest;
import com.testproject.model.StockBuyRequest;
import com.testproject.service.BuyStockService;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@Singleton
public class BuyStockRequestHandler implements EventHandler<StockBuyRequest> {

    private final int EXECUTOR_SERVICE_COUNT = 100;
    private List<ExecutorService> executorService = new ArrayList<>(EXECUTOR_SERVICE_COUNT);
    private BuyStockService buyStockService = new BuyStockService();

    public BuyStockRequestHandler() {
        for (int i = 0; i < EXECUTOR_SERVICE_COUNT; i++) {
            executorService.add(Executors.newSingleThreadExecutor());
        }
    }

    @Override
    public void process(StockBuyRequest request) {
        CompletableFuture.supplyAsync(() -> {
                    checkIfValid(request);
                    return buyStockService.buyStock(request);
                },
                executorService.get(request.getStockDetail().getHashCode() % 100)).
                thenAccept(result -> {
                    //return response
                });
    }

    private void checkIfValid(StockBuyRequest request) {
        if (request.getStockDetail().getCount() <= 0) {
            throw new InvalidRequest("Stock count has to be greater than zero");
        }
        if (request.getStockDetail().getSymbol().equals("")) {
            throw new InvalidRequest("Invalid Stock Symbol");
        }
        // Handle Invalid Requests
    }
}
