package com.gradle.java;

public class MoodAnalyserException extends Exception {
    public enum ExceptionType{
        ENTERED_NULL,ENTERED_EMPTY,NO_SUCH_CLASS, NO_SUCH_METHOD, METHOD_INVOCATION_ISSUE,
        NO_ACCESS, OBJECT_CREATION_ISSUE,NO_SUCH_FIELD
    }
    public ExceptionType type;
    public MoodAnalyserException(String message){
        super(message);
    }
    public MoodAnalyserException(ExceptionType type,String message) {
        super(message);
        this.type=type;
    }


}