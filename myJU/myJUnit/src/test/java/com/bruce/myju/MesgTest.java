package com.bruce.myju;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MesgTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    String message = "HI";
    Message myMessage = new Message(message);
    @Test
    public void testPrintMessage(){
        assertEquals("message", myMessage.printMessage());
    }
}
