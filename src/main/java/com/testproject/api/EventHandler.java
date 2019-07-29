package com.testproject.api;

import com.testproject.model.Request;
import com.testproject.model.Response;

public interface EventHandler<REQ extends Request, RESP extends Response> {
    RESP process(REQ request);
}
