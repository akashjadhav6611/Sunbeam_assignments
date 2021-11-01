package com.app.vehicle;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
	private String chasisNo;
	private String color;
	private double price;
	private Date manufactureDate;
	private String category;
	// SDF : for parsing + formatting
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("yyyy-MM-dd");
	}

	public Vehicle(String chasisNo, String color, double price, Date manufactureDate,String category) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.category=category;
	}
	public Vehicle(String chasisNo) {
		// TODO Auto-generated constructor stub
		this.chasisNo = chasisNo;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" 
	+ price +" manufactured on "+sdf.format(manufactureDate)+" category "+category;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicle's equals method");
		if (o instanceof Vehicle)
			return this.chasisNo.equals(((Vehicle) o).chasisNo);//content equality
		     return false;// => incompatible types !!!!!
	}
}
