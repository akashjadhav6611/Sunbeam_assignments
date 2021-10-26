package com.app.vehicles;

import java.util.Date;

public class Vehicle {
	
	private int chasisno;
	private static int i;
	private static Date date;
	private static String category;
	private static String color;
	private double price;
	private static int count =0 ;
  public Vehicle()
	{
		this(i, color," ",0.0,category, date);
	}
	
	
	public Vehicle(int i, String color, String string2, double price, String string, Date date) {
		
		this.chasisno = ++count;
	 this.color =color;
	 this.price =price;
	}


	public Vehicle(int nextInt, String next, double nextDouble, String string, Date date) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Vehicle [chasisno=" + chasisno + ", color=" + color + ", price=" + price + "]";
	}
	

}




