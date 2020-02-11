package com.bruce.myju;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Unit test for simple App.
 */
public class TestRunner{
    public static void main(String [] args){
        Result result = JUnitCore.runClasses(MesgTest.class);

        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
} 