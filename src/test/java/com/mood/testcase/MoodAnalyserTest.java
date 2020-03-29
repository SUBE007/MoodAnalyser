package com.mood.testcase;


import com.gradle.java.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("happy");
        //String mood = moodAnalyser.analyseMood(); by using object
        String mood = MoodAnalyser.analyseMood();//by using class name
        Assert.assertEquals("happy", mood);
    }

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser("sad");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("sad", mood);
    }

    @Test
    public void givenMessage_WhenAny_ShouldReturnHappy()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("happy", mood);
    }

}
