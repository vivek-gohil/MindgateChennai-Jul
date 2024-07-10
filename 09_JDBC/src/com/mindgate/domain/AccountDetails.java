package com.mindgate.domain;

public class AccountDetails {
	private int accountId;
	private String name;
	private double balance;

	public AccountDetails() {
		// TODO Auto-generated constructor stub
	}

	public AccountDetails(int accountId, String name, double balance) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.balance = balance;
	}

	public AccountDetails(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountDetails [accountId=" + accountId + ", name=" + name + ", balance=" + balance + "]";
	}

}
