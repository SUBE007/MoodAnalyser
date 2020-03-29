package com.mood.testcase;


import com.gradle.java.MoodAnalyser;
import com.gradle.java.MoodAnalyserException;
import com.gradle.java.MoodAnalyserFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() throws MoodAnalyserException {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("happy");
            //String mood = moodAnalyser.analyseMood(); by using object
            String mood = MoodAnalyser.analyseMood();//by using class name
            Assert.assertEquals("happy", mood);
        }catch (MoodAnalyserException e){
            e.printStackTrace();
        }

    }

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalyserException {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("sad");
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("sad", mood);
        }catch (MoodAnalyserException e){
            e.printStackTrace();
        }

    }

    @Test
    public void givenMessage_WhenAny_ShouldReturnHappy() throws MoodAnalyserException {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("happy", mood);
        }catch (MoodAnalyserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenMood_WhenNull_ShouldReturnNullException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("happy", mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMood_WhenEmpty_ShouldReturnEmptyException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        String mood = "";
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("happy", mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenWrongConstructorName_WithDefaultConstructor_ShouldReturnNoSuchMethodException(){
        try{
            Object myObject= MoodAnalyserFactory.createMoodAnalyserObject();
            Assert.assertEquals("MoodConstructor",myObject);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenWrongConstructorName_ArgumentConstructor_ShouldReturnNoClassException(){
        try{
            Object myObject= MoodAnalyserFactory.createMoodAnalyserObject("MoodAnalysers");
            Assert.assertEquals("MoodAnalysers",myObject);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenObject_WhenEqual_ReturnTestPasses(){
        MoodAnalyser mood=new MoodAnalyser("Object1");
        boolean result=mood.equals("Object1");
        Assert.assertEquals(true,result);
    }

}
