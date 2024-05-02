package edu.mum.cs.cs525.labs.skeleton;

public class Application {
	public static void main(String[] args) {
		AccountService accountService = new AccountServiceImpl();

		// create 2 accounts;
		Account account1 = accountService.createSavingsAccount("1263862", "Frank Brown");
		Account account2 = accountService.createCheckingsAccount("4253892", "John Doe");
		// set interest promotion for account 1
		InterestStrategy interestStrategy1 = account1.getInterestStrategy();
		interestStrategy1 = new P1(interestStrategy1);
		interestStrategy1 = new P2(interestStrategy1);
		account1.setInterestStrategy(interestStrategy1);
		// set interest promotion for account 1
		InterestStrategy interestStrategy2 = account2.getInterestStrategy();
		interestStrategy2 = new P2(interestStrategy2);
		interestStrategy2 = new P3(interestStrategy2);
		account2.setInterestStrategy(interestStrategy2);
		// use account 1;
		accountService.deposit("1263862", 240);
		accountService.deposit("1263862", 529);
		accountService.withdraw("1263862", 230);
		// use account 2;
		accountService.deposit("4253892", 12450);
		accountService.transferFunds("4253892", "1263862", 100, "payment of invoice 10232");
		// add interest for 2 accounts
		accountService.addInterest("1263862");
		accountService.addInterest("4253892");
		// show balances
		for (Account account : accountService.getAllAccounts()) {
			Customer customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountNumber());
			System.out.println("Account Holder: " + customer.getName());
			
			System.out.println("-Date-------------------------" 
					+ "-Description------------------" 
					+ "-Amount-------------");
			
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", 
						entry.getDate().toString(), 
						entry.getDescription(),
						entry.getAmount());
			}
			
			System.out.println("----------------------------------------" + "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:", account.getBalance());
		}
	}

}
