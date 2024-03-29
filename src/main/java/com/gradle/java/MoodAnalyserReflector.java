package com.gradle.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserReflector {
    public static MoodAnalyser createMoodAnalyserObject() throws MoodAnalyserException {
        try {
            Class<?> moodAnalyserClass = (Class.forName("com.gradle.java.MoodAnalyser"));
            Constructor<?> moodConstructor = moodAnalyserClass.getConstructor(Object.class);
            return (MoodAnalyser) moodConstructor.newInstance();

        }  catch (InstantiationException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.OBJECT_CREATION_ISSUE, "OBJECT_CREATION_EXCEPTION");
        } catch (InvocationTargetException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.METHOD_INVOCATION_ISSUE, "METHOD_INVOCATION_EXCEPTION");
        } catch (NoSuchMethodException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NO_SUCH_METHOD, "NO_SUCH_METHOD_EXCEPTION");
        } catch (IllegalAccessException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NO_ACCESS, "ILLEGAL_ACCESS_EXCEPTION");
        } catch (ClassNotFoundException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NO_SUCH_CLASS, "NO_SUCH_CLASS_EXCEPTION");
        }

    }

    public static MoodAnalyser createMoodAnalyserObject(String messg) throws MoodAnalyserException {
        try {
            Class<?> moodAnalyserClass = (Class.forName("com.gradle.java.MoodAnalyser"));
            Constructor<?> moodConstructor = moodAnalyserClass.getConstructor(String.class);
            return (MoodAnalyser) moodConstructor.newInstance(messg);

        } catch (ClassNotFoundException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NO_SUCH_CLASS, "NO_SUCH_CLASS_EXCEPTION");
        } catch (NoSuchMethodException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NO_SUCH_METHOD, "NO_SUCH_METHOD_EXCEPTION");
        } catch (IllegalAccessException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NO_ACCESS, "ILLEGAL_ACCESS_EXCEPTION");
        } catch (InstantiationException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.OBJECT_CREATION_ISSUE, "OBJECT_CREATION_EXCEPTION");
        } catch (InvocationTargetException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.METHOD_INVOCATION_ISSUE, "METHOD_INVOCATION_EXCEPTION");
        }

    }

    public static Constructor<?>[] getConstructor(Class<?> ... param) throws MoodAnalyserException {
        try {
            Class<?> moodAnalyserClass=Class.forName("com.gradle.java.MoodAnalyser");
            return moodAnalyserClass.getConstructors();
        } catch (ClassNotFoundException e){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NO_SUCH_CLASS, "NO_SUCH_CLASS_EXCEPTION");
        }
    }

    public static Object createMoodAnalyser(Constructor<?> constructor,Object ...message) throws MoodAnalyserException {
        try{
            return constructor.newInstance(message);
        } catch (IllegalAccessException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NO_ACCESS, "ILLEGAL_ACCESS_EXCEPTION");
        } catch (InstantiationException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.OBJECT_CREATION_ISSUE, "OBJECT_CREATION_EXCEPTION");
        } catch (InvocationTargetException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.METHOD_INVOCATION_ISSUE, "METHOD_INVOCATION_EXCEPTION");
        }
    }

    public static Object invokeMethod(Object moodAnalyseObject, String analyseMood) throws MoodAnalyserException {
        try {
            return moodAnalyseObject.getClass().getMethod(analyseMood).invoke(moodAnalyseObject);
        }catch (NoSuchMethodException e){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NO_SUCH_METHOD,"No_SUCH_METHOD_EXCEPTION");
        } catch (IllegalAccessException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NO_ACCESS, "NO_ACCESS");
        } catch (InvocationTargetException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.METHOD_INVOCATION_ISSUE, "METHOD_INVOCATION_EXCEPTION");

        }

    }

    public static void setFieldValue(Object obj, String fieldName, String fieldValue) throws MoodAnalyserException {
        try {
            Field field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(obj, fieldValue);
        } catch (NoSuchFieldException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NO_SUCH_FIELD, "NO_SUCH_FIELD");
        } catch (IllegalAccessException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NO_ACCESS, "NO_ACCESS");
        }
    }
}
