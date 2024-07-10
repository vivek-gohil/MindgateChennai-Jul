package com.mindgate.domain;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	private int employeeId;
	private String name;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		System.out.println("in hashCode");
		return employeeId + name.hashCode() + (int) salary;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals");
		Employee employee = (Employee) obj;
		if (this.employeeId == employee.getEmployeeId() && this.name.equals(employee.getName())
				&& this.salary == employee.getSalary())
			return true;
		else
			return false;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e) {
		return (int) salary - (int) e.getSalary();
	}

}
