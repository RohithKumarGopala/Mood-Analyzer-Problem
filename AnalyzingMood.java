package com.moodAnalyzer;


    public class AnalyzingMood{
        private String message;

        public AnalyzingMood(String message) {
            this.message = message;
        }

        public String analyseMood() {
            try {
                if (message.contains("sad"))
                    return "sad";
                else
                    return "Happy";
            } catch (NullPointerException e) {
                return "Happy";
            }
        }
    }