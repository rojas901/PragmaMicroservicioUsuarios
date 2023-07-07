package com.pragma.powerup.infrastructure.exceptionhandler;

public enum ExceptionResponse {

    ROL_NOT_FOUND("No rol found for the requested petition"),
    USUARIO_EXISTENTE("User already exist with this email");

    private final String message;

    ExceptionResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}