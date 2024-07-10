package com.mindgate.domain;

//Savings is a Account
public class Savings extends Account {
	private double minimumBalance;
	private boolean isSalaryAccount;

	public Savings() {
		System.out.println("Default constructor of Savings");
	}

	public Savings(long accountNumber, String name, double balance, double minimumBalance, boolean isSalaryAccount) {
		super(accountNumber, name, balance);
		this.isSalaryAccount = isSalaryAccount;
		if (isSalaryAccount)
			this.minimumBalance = 0;
		else
			this.minimumBalance = minimumBalance;
		System.out.println("Overloaded constructor of Savings");
	}

	public Savings(String name, double balance, double minimumBalance, boolean isSalaryAccount) {
		super(name, balance);
		this.isSalaryAccount = isSalaryAccount;
		if (isSalaryAccount)
			this.minimumBalance = 0;
		else
			this.minimumBalance = minimumBalance;
		System.out.println("Overloaded constructor of Savings");
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= (getBalance() - minimumBalance)) {
			setBalance(getBalance() - amount);
			return true;
		}
		return false;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

}
