package com.testproject.model;

import javax.validation.constraints.NotNull;
import java.util.UUID;

public class Request {
    @NotNull
    StockDetail stockDetail;
    @NotNull
    UUID eventID;
    @NotNull
    UUID userUUID;

    public Request() {

    }

    public Request(StockDetail stockDetail, UUID eventID, UUID userUUID) {
        this.stockDetail = stockDetail;
        this.eventID = eventID;
        this.userUUID = userUUID;
    }

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
}
