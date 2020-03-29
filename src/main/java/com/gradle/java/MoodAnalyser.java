package com.gradle.java;

public class MoodAnalyser {
    public static String analyseMood(String message) {
        if (message.equals("happy"))
            return "happy";
        else
            return "sad";
    }
}