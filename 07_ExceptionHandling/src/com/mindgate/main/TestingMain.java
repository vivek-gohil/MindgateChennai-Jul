package com.mindgate.main;

import com.mindgate.domain.Employee;

public class TestingMain {
	public static void main(String[] args) {
		String name = new String("Arun");
		String newName = new String("Arun");

		System.out.println(name.hashCode());
		System.out.println(newName.hashCode());
		System.out.println(name.equals(newName)); // true
//		System.out.println(name == newName); // false
//


		System.out.println("-------------------------");

		Employee employee1 = new Employee(101, "Test1", 1000);
		Employee employee2 = new Employee(101, "Test1", 1000);

		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee1.equals(employee2)); // true

	}
}
