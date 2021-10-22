package com.app.fruits;

public class Mango extends Fruit {

	// parameterized constructor to initialize members....
	public Mango(String color, double weight, String name) {
		
		super(color, weight, name);
		
	}
	
	//Overridden taste method.....
	public String Taste() {
	
		 return " Sweet ";
		
	}
	
}
