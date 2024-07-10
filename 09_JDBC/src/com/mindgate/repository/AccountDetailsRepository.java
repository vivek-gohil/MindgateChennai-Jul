package com.mindgate.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mindgate.domain.AccountDetails;

public class AccountDetailsRepository {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "training_chennai";
	private static final String PASSWORD = "training_chennai";
	private static final String DRIVER_CLASS_NAME = "oracle.jdbc.driver.OracleDriver";
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	private static final String SELECT_ALL_ACCOUNT_DETAILS = "SELECT * FROM account_details";
	private static final String SELECT_ONE_ACCOUNT_DETAILS = "SELECT * FROM account_details WHERE account_id=?";
	private static final String INSERT_NEW_ACCOUNT_DETAILS = "INSERT INTO account_details(name,balance) VALUES(?,?)";
	private static final String UPDATE_ACCOUNT_DETAILS = "UPDATE account_details SET name=?,balance=? WHERE account_id=?";
	private static final String DELETE_ACCOUNT_BY_ACCOUNT_ID = "DELETE account_details WHERE account_id=?";

	public boolean deleteAccountDetailsByAccoutId(int accountId) {
		try {
			Class.forName(DRIVER_CLASS_NAME);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			preparedStatement = connection.prepareStatement(DELETE_ACCOUNT_BY_ACCOUNT_ID);
			preparedStatement.setInt(1, accountId);
			int rowCount = preparedStatement.executeUpdate();
			if (rowCount > 0)
				return true;

		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Failed To Connect Database");
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public boolean updateAccountDetails(AccountDetails accountDetails) {
		try {
			Class.forName(DRIVER_CLASS_NAME);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			preparedStatement = connection.prepareStatement(UPDATE_ACCOUNT_DETAILS);
			preparedStatement.setString(1, accountDetails.getName());
			preparedStatement.setDouble(2, accountDetails.getBalance());
			preparedStatement.setInt(3, accountDetails.getAccountId());
			int rowCount = preparedStatement.executeUpdate();
			if (rowCount > 0)
				return true;

		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Failed To Connect Database");
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean addNewAccountDetails(AccountDetails accountDetails) {
		try {
			Class.forName(DRIVER_CLASS_NAME);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			preparedStatement = connection.prepareStatement(INSERT_NEW_ACCOUNT_DETAILS);
			preparedStatement.setString(1, accountDetails.getName());
			preparedStatement.setDouble(2, accountDetails.getBalance());

			int rowCount = preparedStatement.executeUpdate();
			if (rowCount > 0)
				return true;

		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Failed To Connect Database");
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	public List<AccountDetails> getAllAccountDetails() {
		try {
			Class.forName(DRIVER_CLASS_NAME);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			preparedStatement = connection.prepareStatement(SELECT_ALL_ACCOUNT_DETAILS);
			resultSet = preparedStatement.executeQuery();

			List<AccountDetails> accountDetailsList = new ArrayList<AccountDetails>();

			while (resultSet.next()) {
				int accountId = resultSet.getInt("account_id");
				String name = resultSet.getString("name");
				double balance = resultSet.getDouble("balance");

				AccountDetails accountDetails = new AccountDetails(accountId, name, balance);

				accountDetailsList.add(accountDetails);
			}

			return accountDetailsList;

		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Failed To Connect Database");
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public AccountDetails getAccountDetailsByAccountId(int accountId) {
		try {
			Class.forName(DRIVER_CLASS_NAME);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			preparedStatement = connection.prepareStatement(SELECT_ONE_ACCOUNT_DETAILS);
			preparedStatement.setInt(1, accountId);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				String name = resultSet.getString("name");
				double balance = resultSet.getDouble("balance");

				AccountDetails accountDetails = new AccountDetails(accountId, name, balance);

				return accountDetails;
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Failed To Connect Database");
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

}
