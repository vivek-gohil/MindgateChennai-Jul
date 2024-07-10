package com.mindgate.main;

import com.mindgate.domain.Shape;
import com.mindgate.domain.Triangle;

public class ShapeMain {
	public static void main(String[] args) {
		//Shape shape = new Shape(); - error - cannot create object of Abstract Class
		Shape shape;
		
		shape = new Triangle();
		
		shape.draw();
	}
}
