package edu.mum.cs.cs525.labs.skeleton;

public class P3 extends InterestPromotionDecorator {
    public P3(InterestStrategy interestStrategy) {
        this.interestStrategy = interestStrategy;
    }

    public double getInterest(double balance) {
        return interestStrategy.getInterest(balance) + 3;
    }
}
