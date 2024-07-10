package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.domain.Account;
import com.mindgate.domain.Current;
import com.mindgate.domain.Savings;

public class AccountMainV6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountChoice;
		String continueChoice;
		boolean isSalary;
		Account account = null;
		System.out.println("Account Menu");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		System.out.println("Enter your choice");
		accountChoice = scanner.nextInt();

		System.out.println("Enter account number");
		long accountNumber = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter name");
		String name = scanner.nextLine();
		System.out.println("Enter balance");
		double balance = scanner.nextDouble();

		switch (accountChoice) {
		case 1:
			System.out.println("Do you want to open salary account true-false");
			isSalary = scanner.nextBoolean();
			account = new Savings(accountNumber, name, balance, 2500, isSalary);
			break;
		case 2:
			System.out.println("Enter overdraft balance");
			double overdraftBalance = scanner.nextDouble();
			account = new Current(accountNumber, name, balance, overdraftBalance);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		System.out.println("Account created successfully");
		if (account instanceof Savings) {
			System.out.println("Account Number =" + account.getAccountNumber());
			System.out.println("Name = " + account.getName());
			System.out.println("Balance = " + account.getBalance());
			Savings savings = (Savings) account;
			System.out.println("Minimum Balance = " + savings.getMinimumBalance());
		} else {
			System.out.println("Account Number =" + account.getAccountNumber());
			System.out.println("Name = " + account.getName());
			System.out.println("Balance = " + account.getBalance());
			Current current = (Current) account;
			System.out.println("Overdraft Balance=" + current.getOverdraftBalance());
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
				boolean transactionStatus = account.withdraw(amount);
				if (transactionStatus) {
					System.out.println("Withdraw successfull");
					System.out.println("Balance :: " + account.getBalance());
					if (account instanceof Current)
						System.out.println("Overdraft Balance :: " + ((Current) account).getOverdraftBalance());
				} else {
					System.out.println("Withdraw failed");
					System.out.println("Balance :: " + account.getBalance());
					if (account instanceof Current)
						System.out.println("Overdraft Balance :: " + ((Current) account).getOverdraftBalance());
				}
				break;
			case 2:
				System.out.println("Enter amount to be deposited");
				amount = scanner.nextDouble();
				transactionStatus = account.deposit(amount);
				if (transactionStatus) {
					System.out.println("Deposit successfull");
					System.out.println("Balance :: " + account.getBalance());
					if (account instanceof Current)
						System.out.println("Overdraft Balance :: " + ((Current) account).getOverdraftBalance());
				} else {
					System.out.println("Deposit failed");
					System.out.println("Balance :: " + account.getBalance());
					if (account instanceof Current)
						System.out.println("Overdraft Balance :: " + ((Current) account).getOverdraftBalance());
				}
				break;
			case 3:
				System.out.println("Balance :: " + account.getBalance());
				if (account instanceof Current)
					System.out.println("Overdraft Balance :: " + ((Current) account).getOverdraftBalance());
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
