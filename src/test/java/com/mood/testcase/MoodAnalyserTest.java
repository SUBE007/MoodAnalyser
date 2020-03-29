package com.mood.testcase;


import com.gradle.java.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() {
        String  mood = MoodAnalyser.analyseMood("happy");
        Assert.assertEquals("happy", mood);
    }
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        String  mood = MoodAnalyser.analyseMood("sad");
        Assert.assertEquals("sad", mood);
    }

}
