package com.testproject.exceptionHandlers;

public class InvalidRequest extends RuntimeException {

    public InvalidRequest(String message) {
        super(message);
    }
}
