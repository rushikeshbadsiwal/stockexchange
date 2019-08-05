package com.testproject.model;


import java.util.List;
import java.util.UUID;

public class User {
    private final UUID userUUID;
    private String name;

    public User(UUID userUUID) {
        this.userUUID = userUUID;
    }

    public User(UUID userUUID, String name) {
        this.userUUID = userUUID;
        this.name = name;
    }
}
