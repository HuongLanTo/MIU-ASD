package edu.mum.cs.cs525.labs.skeleton;

public class Logger implements Observer {
    public void act(String message, String actType) {
        System.out.println("LOGGER: " + message);
    }
}
