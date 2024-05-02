package edu.mum.cs.cs525.labs.skeleton;

import java.util.Collection;
import java.util.List;

public interface AccountService {
    Account createAccount(String accountNumber, String customerName, List<Observer> observers);
    Account getAccount(String accountNumber);
    Collection<Account> getAllAccounts();
    void deposit (String accountNumber, double amount);
    void withdraw (String accountNumber, double amount);
    void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description);
}
