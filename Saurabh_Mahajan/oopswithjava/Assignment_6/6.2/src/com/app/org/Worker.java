package com.app.org;

public class Worker extends Emp
{
	private double hoursWorked;
	private double hourlyRate;
	
	public Worker(String name, String deptId, double basic, double hoursWorked, double hourlyRate) 
	{
		super(name, deptId, basic);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	public Worker()
	{
		super();
		this.hoursWorked=0.0;
		this.hourlyRate=0.0;
	}
	
	public String toString()
	{
		return super.toString()+", hoursWorked : "+this.hoursWorked+", hourlyRate : "+this.hourlyRate;
	}
	
	public double netSalary()
	{
		return super.getBasic() + (this.hoursWorked * this.hourlyRate);
	}
	
	public double getHourlyRate()
	{
		return this.hourlyRate;
	}
}
