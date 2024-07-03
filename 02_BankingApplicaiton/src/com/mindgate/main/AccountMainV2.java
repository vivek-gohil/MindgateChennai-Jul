package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.domain.Account;

public class AccountMainV2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String continueChoice;
		System.out.println("Enter account number");
		long accountNumber = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter name");
		String name = scanner.nextLine();
		System.out.println("Enter balance");
		double balance = scanner.nextDouble();

//		Account account = new Account();
//		account.setAccountNumber(accountNumber);
//		account.setName(name);
//		account.setBalance(balance);
		
		Account account = new Account(accountNumber, name, balance);

		
		do {
			System.out.println("Account created successfully!!");
			System.out.println("Transaction Menu");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("Enter your choice");
			int transactionChoice = scanner.nextInt();

			switch (transactionChoice) {
			case 1:
				System.out.println("Enter amount to be withdrawn");
				double amount = scanner.nextDouble();
				boolean transactionStatus = account.withdraw(amount);
				if (transactionStatus) {
					System.out.println("Withdraw successfull");
					System.out.println("Balance :: " + account.getBalance());
				} else {
					System.out.println("Withdraw failed");
					System.out.println("Balance :: " + account.getBalance());
				}
				break;
			case 2:
				System.out.println("Enter amount to be deposited");
				amount = scanner.nextDouble();
				transactionStatus = account.deposit(amount);
				if (transactionStatus) {
					System.out.println("Deposit successfull");
					System.out.println("Balance :: " + account.getBalance());
				} else {
					System.out.println("Deposit failed");
					System.out.println("Balance :: " + account.getBalance());
				}
				break;
			case 3:
				System.out.println("Balance :: " + account.getBalance());
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}

			System.out.println("Do you want to continue?");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));
		System.out.println("Thank you");
	}
}
