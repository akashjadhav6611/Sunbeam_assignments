package com.app.org;

//import java.util.concurrent.ThreadLocalRandom;

public class Emp {
	
	private static int counter;
	private int id;
	private String deptId, name;
	private double basicSal;
	
	// Generate random integers  
    //int int_random = ThreadLocalRandom.current().nextInt();
    
    {
    	counter++;
    }
	
	public Emp(String name, String deptId, double basicSal)
	{
		this.id = counter;
		this.name = name;
		this.deptId = deptId;
		this.basicSal = basicSal;
	}

	@Override
	public String toString() {
		return " [id=" + id + ", deptId=" + deptId + ", name=" + name + ", basicSal=" + basicSal;
	}

	public double getBasicSal() {
		return basicSal;
	}
	
	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}
}
