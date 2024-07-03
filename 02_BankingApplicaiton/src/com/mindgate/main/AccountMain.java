package com.mindgate.main;

import com.mindgate.domain.*;

public class AccountMain {
	public static void main(String[] args) {
		System.out.println("main start");
		// Create account class object and call set method
		Account account = new Account();

		account.setAccountNumber(101);
		account.setName("Mindgate Chennai");
		account.setBalance(50000);

		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());
		
		System.out.println("-------------------------------------");
		
		Account account2 = new Account();

		account2.setAccountNumber(102);
		account2.setName("Mindgate Mumbai");
		account2.setBalance(40000);

		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getName());
		System.out.println(account2.getBalance());

		System.out.println("main end");

	}
}
