package com.mindgate.main;

import com.mindgate.domain.*;

public class CircleMain {
	public static void main(String[] args) {
		Circle circle = new Circle();
		double area = circle.area(12);
		System.out.println("Area of circle = " + area);
	}
}
