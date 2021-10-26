package com.app.vehicles;

public class Vehicle 
{
	private static int count = 0;
	private int chasisNo; 
	private String color;
	private double price;

	public Vehicle(String color, double price) 
	{
		this.chasisNo = ++count;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + "]";
	}
	
	public boolean equals(Vehicle temp)
	{
		if(this.chasisNo == temp.chasisNo)
		{
			return true;
		}
		return false;
	}

}
