package org.example;

public enum ExceptionType {
    NULL("Input can not be null"),
    EMPTY("Input can not be empty string");
    private final String message;
    ExceptionType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}