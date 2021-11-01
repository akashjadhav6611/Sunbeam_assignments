package com.employee_info;

public class Employee {
	private static int count = 0;
	private int id;
	private double salary;
	private String name;
	
	
	public Employee(String name,double salary) {
		this.id=++count;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		
		return "ID : "+this.id +" Name : " +this.name+"  Salary : "+this.salary;
	}
}
