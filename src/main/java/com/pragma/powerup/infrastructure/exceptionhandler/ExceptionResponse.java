package com.pragma.powerup.infrastructure.exceptionhandler;

public enum ExceptionResponse {

    ROLE_NOT_FOUND("No role found for the requested petition");

    private final String message;

    ExceptionResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}