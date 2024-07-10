package com.mindgate.service;

import java.util.List;

import com.mindgate.domain.AccountDetails;
import com.mindgate.repository.AccountDetailsRepository;

public class AccountDetailsService {

	private AccountDetailsRepository accountDetailsRepository = new AccountDetailsRepository();

	public List<AccountDetails> getAllAccountDetails() {
		List<AccountDetails> accountDetailsList = accountDetailsRepository.getAllAccountDetails();
		return accountDetailsList;
	}

	public AccountDetails getAccountDetailsByAccountId(int accountId) {
		AccountDetails accountDetails = accountDetailsRepository.getAccountDetailsByAccountId(accountId);
		return accountDetails;
	}

	public boolean deleteAccountDetailsByAccoutId(int accountId) {
		boolean result = accountDetailsRepository.deleteAccountDetailsByAccoutId(accountId);
		return result;
	}

	public boolean updateAccountDetails(AccountDetails accountDetails) {
		return accountDetailsRepository.updateAccountDetails(accountDetails);
	}

	public boolean addNewAccountDetails(AccountDetails accountDetails) {
		return accountDetailsRepository.addNewAccountDetails(accountDetails);
	}
}
