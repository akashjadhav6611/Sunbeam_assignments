package com.app.vehicles;

public class Vehicle {
	/*
	 * chasisNo : int , color : String , price : double
	 *chasisNo  MUST be unique (non duplicate) for any vehicle (primary Key : unique ID)
	 */
	private int chasisNo;
	private String color;
	private double price;

	public Vehicle(int chasisNo, String color, double price, String regNo) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
		chasisNo += 1;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo="+ chasisNo +", color=" + color + ", price=" + price + "]";
	}
	
	public boolean equals(Vehicle veh) {
		return this.chasisNo == veh.chasisNo;
	}
	
}
