package com.mindgate.main;

import com.mindgate.domain.Current;

public class AccountMainV5 {
	public static void main(String[] args) {
		Current current = new Current(101, "Test", 10000, 70000);
		System.out.println("withdraw:5000");
		current.withdraw(5000); // 5000 , 70000
		System.out.println("Balance : " + current.getBalance());
		System.out.println("Overdraft Balance " + current.getOverdraftBalance());

		System.out.println("withdraw:10000");
		current.withdraw(10000); // 0 , 65000
		System.out.println("Balance : " + current.getBalance());
		System.out.println("Overdraft Balance " + current.getOverdraftBalance());

		System.out.println("withdraw:5000");
		current.withdraw(5000); // 0,60000
		System.out.println("Balance : " + current.getBalance());
		System.out.println("Overdraft Balance " + current.getOverdraftBalance());

		System.out.println("---------------------------------");

		System.out.println("current.deposit(5000)");
		current.deposit(5000); // 0 , 65000
		System.out.println("Balance : " + current.getBalance());
		System.out.println("Overdraft Balance " + current.getOverdraftBalance());

		System.out.println("current.deposit(20000)");
		current.deposit(20000); // 15000,70000
		System.out.println("Balance : " + current.getBalance());
		System.out.println("Overdraft Balance " + current.getOverdraftBalance());

		System.out.println("current.deposit(5000)");
		current.deposit(5000); // 20000,70000
		System.out.println("Balance : " + current.getBalance());
		System.out.println("Overdraft Balance " + current.getOverdraftBalance());
	}
}
