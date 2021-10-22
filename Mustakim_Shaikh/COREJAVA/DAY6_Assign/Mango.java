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
	
	//user method to add new functionality....
	public void pulp() {
		
		System.out.println(getName()+" " + getColor()+" Creating Pulp!!");
	}
	
}
