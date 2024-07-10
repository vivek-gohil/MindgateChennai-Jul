package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMain {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "training_chennai";
		String password = "training_chennai";
		String driverClassName = "oracle.jdbc.driver.OracleDriver";
		Connection connection = null;

		try {
			// Step 1 - Load Driver
			Class.forName(driverClassName);

			// Step 2 - Connection
			connection = DriverManager.getConnection(url, userName, password);

			System.out.println("Connection Successfull!!");

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
				System.out.println("Failed To Close Connection");
				e.printStackTrace();
			}
		}
		
		

	}

}
