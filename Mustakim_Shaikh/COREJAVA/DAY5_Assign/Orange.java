package com.app.fruits;

public class Orange extends Fruit{

	// parameterized constructor to initialize members....
	public Orange(String color, double weight, String name ) {
		
		super(color , weight , name);
	}
	
	// Overridden method......
	public String taste() {
		
		return " Sour";
	}
	
}
