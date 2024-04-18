package com.example.api.exceptions;

public class ApiException extends Throwable {
    private int statusCode;
    private String message;

    public ApiException(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
