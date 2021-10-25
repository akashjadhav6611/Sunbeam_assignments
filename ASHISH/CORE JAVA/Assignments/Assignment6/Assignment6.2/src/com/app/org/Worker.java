package com.app.org;

public class Worker extends Emp{
	private double hoursWorked, hourlyRate;
	
	public Worker(String name, String deptId, double basicSal, double hoursWorked, double hourlyRate)
	{
		super(name,deptId,basicSal);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	public double netSalary() {
		return getBasicSal() + (hoursWorked * hourlyRate);
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	@Override
	public String toString() {
		return "Worker " + super.toString() + " hoursWorked = " + hoursWorked + " hourlyRate = " +  hourlyRate;
	}
	
	
}
