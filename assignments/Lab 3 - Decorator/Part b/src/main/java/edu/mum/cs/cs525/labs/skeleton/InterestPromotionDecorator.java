package edu.mum.cs.cs525.labs.skeleton;

public class InterestPromotionDecorator implements InterestStrategy {
    InterestStrategy interestStrategy;
    public double getInterest(double balance) {
        return interestStrategy.getInterest(balance);
    }
}
