package com.testproject.api;

import com.testproject.model.Request;

import java.util.concurrent.CompletableFuture;

public class UserEventHandler implements EventHandler {
    @Override
    public CompletableFuture process(Request request) {
        return null;
    }
}
