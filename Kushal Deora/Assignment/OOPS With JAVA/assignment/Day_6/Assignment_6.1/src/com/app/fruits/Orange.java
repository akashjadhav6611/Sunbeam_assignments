package com.app.fruits;

public class Orange extends Fruits {
public Orange(String name, double weight, String color) {
		
		super(name,weight,color);
	
	}
public void juice() {
	//Display name n weight of the fruit : extracting juice!
	
	System.out.println("Name: "+super.getName()+" Color: "+super.getWeight());
	}
	public String taste()
	{
		return "sour";
	}
	
}
