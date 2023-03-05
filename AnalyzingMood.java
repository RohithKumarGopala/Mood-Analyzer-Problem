package com.moodAnalyzer;


    public class AnalyzingMood extends Exception {
        public analyzingType type;

        public AnalyzingMood(analyzingType type, String message){
            super(message);
            this.type = type;
        }

        public AnalyzingMood(analyzingType type, Throwable cause) {
            super(cause);
            this.type = type;
        }

        public AnalyzingMood(analyzingType type,String message, Throwable cause){
            super(message);
            new AnalyzingMood(type,cause);
        }

        public enum analyzingType {
            ENTERED_EMPTY, ENTERED_NULL, NO_SUCH_CLASS, NO_SUCH_METHOD, METHOD_INVOCATION_ISSUE,
            NO_SUCH_FIELD, ILLEGAL_ACCESS
        }
    }


