package com.mindgate.domain;

public class Employee extends Object {
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
		return employeeId + (int) salary;
	}

	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;

		if (this.employeeId == employee.getEmployeeId() && this.name.equals(employee.getName())
				&& this.salary == employee.getSalary()) {
			return true;
		}

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

}
