package com.gradle.java;

public class MoodAnalyser {
    private static String message;
    public MoodAnalyser(String message) {
        this.message= message;
    }
    public  MoodAnalyser()  {

    }

    public static String analyseMood() throws MoodAnalyserException {
        try {
            if (message.length()==0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"EnteredEmptyException");
            else if (message.equals("sad"))
                return "sad";
        }
        catch (NullPointerException e){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"EnteredNullException");
        }
        return "happy";
    }
}