package com.mindgate.main;

import java.util.List;
import java.util.Scanner;

import com.mindgate.domain.AccountDetails;
import com.mindgate.service.AccountDetailsService;

public class AccountDetailsMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// AccountDetailsRepository accountRepository = new AccountDetailsRepository();
		AccountDetailsService accountDetailsService = new AccountDetailsService();

		String continueChoice;
		do {
			System.out.println("Account Menu");
			System.out.println("1. Print All Account Details");
			System.out.println("2. Print Account Details By Account Id");
			System.out.println("3. Add New Account Details");
			System.out.println("4. Update Existing Account Details");
			System.out.println("5. Delete Account Details By Account Id");

			System.out.println("Enter your choice");
			int accountChoice = scanner.nextInt();

			switch (accountChoice) {
			case 4:
				System.out.println("Enter Account Id");
				int accountId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Name");
				String name = scanner.nextLine();
				System.out.println("Enter Balance");
				double balance = scanner.nextDouble();
				AccountDetails accountDetails = new AccountDetails(accountId, name, balance);
				boolean result = accountDetailsService.updateAccountDetails(accountDetails);
				if (result)
					System.out.println("Account Details Updated Successfully");
				else
					System.out.println("Failed To Update Account Details");
				break;
			case 3:
				scanner.nextLine();
				System.out.println("Enter Name");
				name = scanner.nextLine();
				System.out.println("Enter Balance");
				balance = scanner.nextDouble();
				accountDetails = new AccountDetails(name, balance);
				result = accountDetailsService.addNewAccountDetails(accountDetails);
				if (result)
					System.out.println("New Account Is Added Successfully");
				else
					System.out.println("Failed To Add New Account");
				break;
			case 1:
				List<AccountDetails> accountDetailsList = accountDetailsService.getAllAccountDetails();
				for (AccountDetails a : accountDetailsList) {
					System.out.println(a);
				}
				break;
			case 2:
				System.out.println("Enter account id");
				accountId = scanner.nextInt();
				accountDetails = accountDetailsService.getAccountDetailsByAccountId(accountId);
				if (accountDetails != null)
					System.out.println(accountDetails);
				else
					System.out.println("Invalid account id");
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			System.out.println("Do you want to continue");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));
	}
}
