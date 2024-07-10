package com.mindgate.domain;

public class MyClass {
	private static int objectCounter = 0;
	private static int number1 = 10;
	private static int number2 = 10;

	public MyClass() {
		objectCounter++;
		System.out.println("in default constructor");
	}

	{
		System.out.println("in non-static block");
	}

	static {
		System.out.println("static block");
	}

	public int getObjectCounter() {
		return objectCounter;
	}

	public static void display() {
		System.out.println("Number1 = " + number1);
		System.out.println("Number2 = " + number2);
		number1 += 10;
		number2 += 10;
		System.out.println("Number1 = " + number1);
		System.out.println("Number2 = " + number2);
	}
}
