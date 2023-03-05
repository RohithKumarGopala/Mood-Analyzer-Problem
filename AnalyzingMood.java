package com.moodAnalyzer;


    public class AnalyzingMood {
        public class AnalyzingMood extends Exception {
            public exceptionType type;

            public AnalyzingMood(String message) {
                super(message);
                this.type = type;
            }

            public enum exceptionType {
                ENTERED_EMPTY, ENTERED_NULL
            }
        }
    }

