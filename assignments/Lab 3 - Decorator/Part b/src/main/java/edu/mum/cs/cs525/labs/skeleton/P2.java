package edu.mum.cs.cs525.labs.skeleton;

public class P2 extends InterestPromotionDecorator {
    public P2(InterestStrategy interestStrategy) {
        this.interestStrategy = interestStrategy;
    }

    public double getInterest(double balance) {
        return interestStrategy.getInterest(balance) + 2;
    }
}
