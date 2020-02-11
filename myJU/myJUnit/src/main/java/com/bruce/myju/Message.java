package com.bruce.myju;

/**
 * Hello world!
 *
 */
public class Message 
{
    private String message;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public Message(String msg){
        this.message = msg;
    }

    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
