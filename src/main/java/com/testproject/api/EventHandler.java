package com.testproject.api;

import com.testproject.model.Request;
import com.testproject.model.Response;

import java.util.concurrent.CompletableFuture;

public interface EventHandler<REQ extends Request, RESP extends Response> {
    CompletableFuture<RESP> process(REQ request);
}
