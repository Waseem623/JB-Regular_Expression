package org.example;

public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws InvalidMoodException {
        if (message.isEmpty())
            throw new InvalidMoodException(ExceptionType.EMPTY);
        try {
            if (message.contains("happy"))
                return "HAPPY";
            else
                return "SAD";
        } catch (NullPointerException e) {
            throw new InvalidMoodException(ExceptionType.NULL);
        }
    }
}