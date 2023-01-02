package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyserTest {

    @Test
    public void givenSadMoodMessage_whenProper_shouldReturnSadMood() throws InvalidMoodException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String result = moodAnalyser.analyseMood();
        assertEquals("SAD", result);
    }

    @Test
    public void givenHappyMoodMessage_whenProper_shouldReturnHappyMood() throws InvalidMoodException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        String result = moodAnalyser.analyseMood();
        assertEquals("HAPPY", result);
    }

    @Test
    public void givenMoodMessage_whenNull_shouldThrowCustomExceptionWithExceptionTypeNullMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        InvalidMoodException exception = assertThrows(InvalidMoodException.class,
                moodAnalyser::analyseMood);
        assertTrue(exception.getMessage().equalsIgnoreCase(ExceptionType.NULL.getMessage()));
    }
    @Test
    public void givenMoodMessage_whenEmpty_shouldThrowCustomExceptionWithExceptionTypeEmptyMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        InvalidMoodException exception = assertThrows(InvalidMoodException.class,
                moodAnalyser::analyseMood);
        assertTrue(exception.getMessage().equalsIgnoreCase(ExceptionType.EMPTY.getMessage()));
    }
}