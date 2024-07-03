package com.mindgate.main;

import com.mindgate.domain.Calculations;

public class CalculationsMain {
	public static void main(String[] args) {
		System.out.println("main start");
		Calculations calculations = new Calculations();

		int result = calculations.sum(10, 20);
		System.out.println("Addition is " + result);
		System.out.println("main end");
	}
}
