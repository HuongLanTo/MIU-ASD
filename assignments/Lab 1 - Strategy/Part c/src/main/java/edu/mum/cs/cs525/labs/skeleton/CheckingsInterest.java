package edu.mum.cs.cs525.labs.skeleton;

public class CheckingsInterest implements InterestStrategy {
    public double getInterest(double balance) {
        if (balance > 1000) {
            return balance * 2.5 / 100;
        }
        return balance * 1.5 / 100;
    }
}
