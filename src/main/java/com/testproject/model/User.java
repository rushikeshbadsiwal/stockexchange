package com.testproject.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private final UUID userUUID;
    private String name;
    private List<StockDetails> stockList = new ArrayList();

    public User(UUID userUUID) {
        this.userUUID = userUUID;
    }

    public User(UUID userUUID, String name) {
        this.userUUID = userUUID;
        this.name = name;
    }

    public User(UUID userUUID, String name,List<StockDetails> stockList) {
        this.userUUID = userUUID;
        this.stockList = stockList;
        this.name = name;
    }
}
