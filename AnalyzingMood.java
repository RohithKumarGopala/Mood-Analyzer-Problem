package com.moodAnalyzer;


    public class AnalyzingMood{
            private String message;
            public AnalyzingMood(String message) {
                this.message = message;
            }

            public String analyseMood() {
                if(message.contains("Sad"))
                    return "SAD";
                else
                    return "HAPPY";
            }

    }