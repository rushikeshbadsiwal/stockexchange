package com.testproject.api;

import com.testproject.model.Request;

public interface EventHandler<REQ extends Request> {
    void process(REQ request);
}
