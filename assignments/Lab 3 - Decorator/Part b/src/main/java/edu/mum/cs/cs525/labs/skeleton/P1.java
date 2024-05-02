package edu.mum.cs.cs525.labs.skeleton;

public class P1 extends InterestPromotionDecorator {
    public P1(InterestStrategy interestStrategy) {
        this.interestStrategy = interestStrategy;
    }

    public double getInterest(double balance) {
        return interestStrategy.getInterest(balance) + 1;
    }
}
