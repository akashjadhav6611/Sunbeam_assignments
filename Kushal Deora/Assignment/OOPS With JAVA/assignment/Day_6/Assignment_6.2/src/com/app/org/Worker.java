package com.app.org;
/*
 4.3 Worker state  --id,name,basic,deptId,hoursWorked,hourlyRate
Behaviour--- 
1. get worker details -- via toString
2.  compute net salary (formula:  = basic+(hoursWorked*hourlyRate) 
3. get hrlyRate of the worker  -- add a new method to return hourly rate of a worker.(getter)
 */
public class Worker extends Emp{
private double hoursWorked;
private double hourlyRate;


public Worker(int id,String name, String deptId,double basic,double hoursWorked,double hourlyRate)
{
	super(id,name,deptId,basic);
	this.hoursWorked=hoursWorked;
	this.hourlyRate=hourlyRate;
}

@Override
public String toString()
{
	return "Worker Data: "+super.toString()+" Hours Worked: "+this.hoursWorked+" Hourly Rate: "+this.hourlyRate; 
}
public double netSalary()
{
	return (super.getBasic()+(this.hoursWorked*this.hourlyRate));
}

public double getHourlyRate()
{
	return this.hourlyRate;
}

}
