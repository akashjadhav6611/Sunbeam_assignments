package com.app.org;

public abstract class Emp 
{
	private static int count = 0;
	private int id;
	private String name;
	private String deptId;
	private double basic;
	
	
	public Emp()
	{
		this(" "," ",0.0);
	}
	
	public Emp(String name, String deptId, double basic) 
	{
		this.id = ++count;
		this.name = name;
		this.deptId = deptId;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "id : " + id + ", name : " + name + ", deptId : " + deptId + ", basic : " + basic;
	}

	public double getBasic()
	{
		return this.basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	public abstract double netSalary();

}
