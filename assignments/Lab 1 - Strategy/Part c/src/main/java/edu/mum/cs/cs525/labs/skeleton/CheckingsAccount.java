package edu.mum.cs.cs525.labs.skeleton;

public class CheckingsAccount extends Account {

    public CheckingsAccount(String accountNumber) {
        super(accountNumber);
        this.setInterestStrategy(new CheckingsInterest());
    }
}
