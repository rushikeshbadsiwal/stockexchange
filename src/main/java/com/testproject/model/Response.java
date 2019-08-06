package com.testproject.model;

import java.util.UUID;

public class Response {
    StockDetail stockDetail;
    UUID eventID;
    UUID userUUID;
    boolean ifCompleted = false;

    public StockDetail getStockDetail() {
        return stockDetail;
    }

    public void setStockDetail(StockDetail stockDetail) {
        this.stockDetail = stockDetail;
    }

    public UUID getEventID() {
        return eventID;
    }

    public void setEventID(UUID eventID) {
        this.eventID = eventID;
    }

    public UUID getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(UUID userUUID) {
        this.userUUID = userUUID;
    }

    public boolean isIfCompleted() {
        return ifCompleted;
    }

    public void setIfCompleted(boolean ifCompleted) {
        this.ifCompleted = ifCompleted;
    }
}
