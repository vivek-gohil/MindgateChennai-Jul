package com.mindgate.main;

import com.mindgate.domain.Calculations;

public class CalculationsMain {
	public static void main(String[] args) {
		System.out.println("Main start");
		
		Calculations calculations = new Calculations();
		calculations.accept();
		calculations.calculate();
		calculations.display();
		
		System.out.println("Main end");
	}
}
