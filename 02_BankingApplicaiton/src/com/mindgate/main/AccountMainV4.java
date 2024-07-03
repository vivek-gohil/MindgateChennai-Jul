package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.domain.Savings;

public class AccountMainV4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Savings savings = null;
		int accountChoice;
		String continueChoice;
		System.out.println("Account Choice");
		System.out.println("1. Savings Account - Minimum Balance=2500 ");
		System.out.println("2. Salary Account - Minimum Balance=0 ");
		System.out.println("Enter your choice");
		accountChoice = scanner.nextInt();
		if (accountChoice > 2 || accountChoice < 1) {
			System.out.println("Invalid Account choice");
			System.exit(0);
		}
		System.out.println("Enter account number");
		long accountNumber = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter name");
		String name = scanner.nextLine();
		System.out.println("Enter balance");
		double balance = scanner.nextDouble();

		switch (accountChoice) {
		case 1:
			savings = new Savings(accountNumber, name, balance, 2500, false);
			break;
		case 2:
			savings = new Savings(accountNumber, name, balance, 0, true);
			break;
		default:
			System.out.println("Invalid Account choice");
			break;
		}

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
				boolean transactionStatus = savings.withdraw(amount);
				if (transactionStatus) {
					System.out.println("Withdraw successfull");
					System.out.println("Balance :: " + savings.getBalance());
				} else {
					System.out.println("Withdraw failed");
					System.out.println("Balance :: " + savings.getBalance());
				}
				break;
			case 2:
				System.out.println("Enter amount to be deposited");
				amount = scanner.nextDouble();
				transactionStatus = savings.deposit(amount);
				if (transactionStatus) {
					System.out.println("Deposit successfull");
					System.out.println("Balance :: " + savings.getBalance());
				} else {
					System.out.println("Deposit failed");
					System.out.println("Balance :: " + savings.getBalance());
				}
				break;
			case 3:
				System.out.println("Balance :: " + savings.getBalance());
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
