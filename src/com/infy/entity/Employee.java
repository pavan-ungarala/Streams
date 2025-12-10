package com.infy.entity;

public class Employee {
	private String name;
	private String department;
	private String location;
	private double salary;
	
	public Employee(String name, String department, String location, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.location = location;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", location=" + location + ", salary=" + salary
				+ "]";
	}
	
}
