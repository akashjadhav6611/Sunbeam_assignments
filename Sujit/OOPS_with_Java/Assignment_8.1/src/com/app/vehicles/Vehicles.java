package com.app.vehicles;

public class Vehicles {
	private int chasisNo;
	private String color;
	private double price;

	public Vehicles(int chasisNo, String color, double price) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicle's equals method");
		if (o instanceof Vehicles)
			return this.chasisNo == ((Vehicles) o).chasisNo;
		return false;//=> incompatible types !!!!!
	}
}
