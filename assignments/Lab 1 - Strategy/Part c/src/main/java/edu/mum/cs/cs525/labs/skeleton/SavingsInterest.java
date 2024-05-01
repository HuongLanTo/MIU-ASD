package edu.mum.cs.cs525.labs.skeleton;

public class SavingsInterest implements InterestStrategy {
    public double getInterest(double balance) {
        if (balance < 1000) {
            return balance / 100;
        } else if (balance < 5000) {
            return balance * 2 / 100;
        }
        return balance * 4 / 100;
    }
}
