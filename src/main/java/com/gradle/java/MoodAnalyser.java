package com.gradle.java;

public class MoodAnalyser {
    private static String message;
    public MoodAnalyser(String message) {
        this.message= message;
    }
    public  MoodAnalyser()  {

    }

    public static String analyseMood()  {
        try {
            if (message.equals("sad"))
                return "sad";
        }
        catch (NullPointerException e){
            return "Happy";
        }
        return "happy";
    }
}