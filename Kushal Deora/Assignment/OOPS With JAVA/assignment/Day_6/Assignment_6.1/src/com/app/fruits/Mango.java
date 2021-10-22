package com.app.fruits;

public class Mango extends Fruits {
public Mango(String name, double weight, String color) {
		
		super(name,weight,color);
	
	}
public void pulp() {
//	Display name n color of the fruit : creating  pulp!
	System.out.println("Name: "+super.getName()+" Color: "+super.getColor());
	}
public String taste()
{
	return "sweet";
}

}
