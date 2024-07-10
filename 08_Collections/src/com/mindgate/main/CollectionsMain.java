package com.mindgate.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.mindgate.domain.Employee;

public class CollectionsMain {
	public static void main(String[] args) {
		System.out.println("1. ArrayList");
		List<String> nameList = new ArrayList<String>();
		nameList.add("Arun");
		nameList.add("Mindgate");
		nameList.add("Navin");
		nameList.add("Arun");
		nameList.add("Navin");

		System.out.println(nameList);

		System.out.println(nameList.get(1));

		System.out.println(nameList.indexOf("Vivek"));

		System.out.println(nameList.remove("Mindgate"));
		System.out.println(nameList);
		nameList.add(1, "New Name");
		System.out.println(nameList);

		System.out.println("2. HashSet");
		Set<String> nameSet = new HashSet<String>();
		nameSet.add("Arun");
		nameSet.add("Mindgate");
		nameSet.add("Navin");
		nameSet.add("Arun");
		nameSet.add("Navin");

		System.out.println(nameSet);

		System.out.println("----------------------------");

		Employee employee1 = new Employee(101, "Arun", 1000);
		Employee employee2 = new Employee(102, "Navin", 1000);
		Employee employee3 = new Employee(103, "Thaha", 1000);
		Employee employee4 = new Employee(101, "Arun", 1000);
		Employee employee5 = new Employee(102, "Navin", 1000);

		Set<Employee> employeSet = new HashSet<Employee>();
		employeSet.add(employee1);
		employeSet.add(employee2);
		employeSet.add(employee3);
		employeSet.add(employee4);
		employeSet.add(employee5);

		for (Employee e : employeSet) {
			System.out.println(e);
		}

		System.out.println("------------------------------");
		System.out.println("3. TreeSet");
		Set<Integer> numberSet = new TreeSet<Integer>();
		numberSet.add(101);
		numberSet.add(44);
		numberSet.add(23);
		numberSet.add(32);
		numberSet.add(51);

		System.out.println(numberSet);

		System.out.println("----------- In TreeSet Of Employee ----------------");
		Set<Employee> employeTreeSet = new TreeSet<Employee>();

		employee1 = new Employee(104, "Arun", 1000);
		employee2 = new Employee(102, "Navin", 1000);
		employee3 = new Employee(103, "Thaha", 1000);
//		employee4 = new Employee(104, "Arun", 1000);
//		employee5 = new Employee(102, "Navin", 1000);

		employeTreeSet.add(employee1);
		employeTreeSet.add(employee2);
		employeTreeSet.add(employee3);

		for (Employee e : employeTreeSet) {
			System.out.println(e);
		}

	}
}
