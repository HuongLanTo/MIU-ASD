package edu.mum.cs.cs525.labs.skeleton;

public class CheckingsInterest implements InterestStrategy {
    public double getInterest(double balance) {
        if (balance > 1000) {
            return 2.5;
        }
        return 1.5;
    }
}
