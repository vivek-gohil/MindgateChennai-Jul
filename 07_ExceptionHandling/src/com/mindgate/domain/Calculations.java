package com.mindgate.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculations {
	private int number1;
	private int number2;
	private int result;
	Scanner scanner = new Scanner(System.in);
	
	public void accept() {

		try {
			
			System.out.println("Enter Number1");
			number1 = scanner.nextInt();
			System.out.println("Enter Number2");
			number2 = scanner.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println("Oops Invalid Input");
		}
		finally {
		
			System.out.println("Thank you");
			scanner.close();
		}

	}

	public void calculate() {
		System.out.println("Calculating Result");
		result = number1 + number2;
	}

	public void display() {
		System.out.println("Result = " + result);
	}
}
