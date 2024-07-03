package com.mindgate.domain;

public class Current extends Account {
	private double overdraftBalance;
	private double initialOverdraftBalance;

	public Current() {
		System.out.println("Default constructor of Current");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		initialOverdraftBalance = overdraftBalance;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= getBalance()) {
			setBalance(getBalance() - amount);
			return true;
		}
		if (amount > 0 && amount > getBalance() && amount <= getBalance() + overdraftBalance) {
			amount -= getBalance();
			setBalance(0);
			overdraftBalance -= amount;
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			if (initialOverdraftBalance > overdraftBalance) {
				if (amount < (initialOverdraftBalance - overdraftBalance)) {
					overdraftBalance += amount;
					return true;
				} else {
					amount = amount - (initialOverdraftBalance - overdraftBalance);
					overdraftBalance = initialOverdraftBalance;
					setBalance(amount);
					return true;
				}
			} else {
				setBalance(getBalance() + amount);
				return true;
			}
		}
		return false;
	}

}
