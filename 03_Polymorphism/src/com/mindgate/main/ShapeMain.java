package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.domain.*;

public class ShapeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Shape shape = null;
		
		System.out.println("1. Circle");
		System.out.println("2. Triangle");
		System.out.println("3. Rectangle");
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		shape = getShape(choice);
		shape.draw();
		
	}
	
	public static Shape getShape(int choice) {
		if(choice == 1)
			return new Circle();
		if(choice == 2)
			return new Triangle();
		if(choice == 3)
			return new Rectangle();
		else
			return new Shape();
	}
	
	
}
