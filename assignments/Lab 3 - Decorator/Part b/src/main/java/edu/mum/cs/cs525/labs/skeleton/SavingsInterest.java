package edu.mum.cs.cs525.labs.skeleton;

public class SavingsInterest implements InterestStrategy {
    public double getInterest(double balance) {
        if (balance < 1000) {
            return 1;
        } else if (balance < 5000) {
            return 2;
        }
        return 4;
    }
}
