package org.example;

public class InvalidMoodException extends Exception{
    public InvalidMoodException(ExceptionType type) {
        super(type.getMessage());
    }
}