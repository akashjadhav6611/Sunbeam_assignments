package com.app.fruits;

public class Apple extends Fruit{

	// parameterized constructor to initialize members....
	public Apple(String color, double weight, String name ) {
		
		super( color , weight, name);
	}
	
	// Overridden method......
	public String taste() {
		
		return "Sweet n Sour";
	}
	
	// user method to add new functionality....
	
	public void jam() {
	
		System.out.println(getName()+" Making JAM");
		
	}
	
}
