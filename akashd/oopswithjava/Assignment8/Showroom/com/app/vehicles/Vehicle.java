package com.app.vehicles;

import java.util.Date;

public class Vehicle {
	private int chasisNo;
	private String color;
	private double price;
	private Date manufactureDate;
	private String category;

	public Vehicle(int chasisNo, String color, double price, Date mfgDateString, String category) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
		this.manufactureDate = mfgDateString;
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", manufactureDate="
				+ manufactureDate + ", category=" + category + "]";
	}

	@Override
	public boolean equals(Object veh) {
		return this.chasisNo == ((Vehicle)veh).chasisNo;
	}
	
	// getter for chasis number for validation
	public int getChasisNo() {
		return chasisNo;
	}
	
}
