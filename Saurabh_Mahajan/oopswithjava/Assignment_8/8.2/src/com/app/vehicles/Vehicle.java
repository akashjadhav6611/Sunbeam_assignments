package com.app.vehicles;

import java.util.Date;
import com.validation.*;

public class Vehicle
{
	private int chasisNo; 
	private String color;
	private String category;
	private double price;
	private Date manufactureDate;
	
	
	public Vehicle(int chasisNo, String color, String category, double price, Date manufactureDate) 
	{

		this.chasisNo = chasisNo;
		this.color = color;
		this.category = category;
		this.price = price;
		this.manufactureDate = manufactureDate;
	}
	


	@Override
	public String toString() 
	{
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", category=" + category + ", price=" + price
				+ ", manufactureDate=" + manufactureDate + "]";
	}

	public boolean equals(Object v) {
		return this.chasisNo == ((Vehicle)v).chasisNo;
	}
	
	public int getChasisNo() {
		return chasisNo;
	}

	

}
