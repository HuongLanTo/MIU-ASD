package edu.mum.cs.cs525.labs.skeleton;

public class EmailSender implements Observer {
    public void act(String message, String actType) {
        if (actType.equals("create")) {
            System.out.println("EMAIL SENDER: " + message);
        }
    }
}
