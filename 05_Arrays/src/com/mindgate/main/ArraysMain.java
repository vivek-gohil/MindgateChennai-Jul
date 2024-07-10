package com.mindgate.main;

import com.mindgate.domain.Employee;

public class ArraysMain {
	public static void main(String[] args) {
		Employee employees[] = new Employee[5];

		System.out.println("Employee array before storing Employee objects");

		for (Employee e : employees) {
			System.out.println(e);
		}

		System.out.println("Store Employee objects into array");
		employees[0] = new Employee(101, "Test 1", 1000);
		employees[1] = new Employee(102, "Test 2", 1000);
		employees[2] = new Employee(103, "Test 3", 1000);
		employees[3] = new Employee(104, "Test 4", 1000);
		employees[4] = new Employee(105, "Test 5", 1000);

		for (Employee e : employees) {
			System.out.println(e);
			System.out.println();
		}

		System.out.println("______________________________________");

		Employee defaultEmployees[] = new Employee[] { new Employee(101, "Test 1", 1000),
				new Employee(102, "Test 2", 1000), new Employee(103, "Test 3", 1000) };

		for (Employee e : defaultEmployees) {
			System.out.println(e);
			System.out.println();
		}

	}
}
