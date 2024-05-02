package edu.mum.cs.cs525.labs.skeleton;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
        this.setInterestStrategy(new SavingsInterest());
    }
}
