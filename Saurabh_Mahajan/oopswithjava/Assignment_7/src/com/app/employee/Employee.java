package com.app.employee;

public class Employee
{
	private static int count=0;
	private int id;
	private String name;
	private double salary;
	
	public Employee(String name, double salary)
	{
		this.id = ++count;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
