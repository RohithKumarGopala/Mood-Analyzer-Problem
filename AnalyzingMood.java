package com.moodAnalyzer;


public class AnalyzingMood extends Exception {
    public exceptionType type;

    public AnalyzingMood(exceptionType type, String message){
        super(message);
        this.type = type;
    }

    public AnalyzingMood(exceptionType type, Throwable cause) {
        super(cause);
        this.type = type;
    }

    public AnalyzingMood(exceptionType type,String message, Throwable cause){
        super(message);
        new AnalyzingMood(type,cause);
    }

    public enum exceptionType {
        ENTERED_EMPTY, ENTERED_NULL, NO_SUCH_CLASS, NO_SUCH_METHOD, METHOD_INVOCATION_ISSUE
    }
}