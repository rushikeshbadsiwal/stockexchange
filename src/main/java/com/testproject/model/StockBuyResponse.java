package com.testproject.model;

public class StockBuyResponse extends Response {
    long maxPossibleBuy;

    public StockBuyResponse() {

    }

    public StockBuyResponse(StockBuyRequest stockBuyRequest) {
        this.stockDetail = stockBuyRequest.stockDetail;
        this.eventID = stockBuyRequest.eventID;
        this.userUUID = stockBuyRequest.userUUID;
    }

    public long getMaxPossibleBuy() {
        return maxPossibleBuy;
    }

    public void setMaxPossibleBuy(long maxPossibleBuy) {
        this.maxPossibleBuy = maxPossibleBuy;
    }
}
