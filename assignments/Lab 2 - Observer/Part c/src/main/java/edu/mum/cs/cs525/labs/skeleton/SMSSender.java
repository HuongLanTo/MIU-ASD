package edu.mum.cs.cs525.labs.skeleton;

public class SMSSender implements Observer {
    public void act(String message, String actType) {
        System.out.println("SMS SENDER: " + message);
    }
}
