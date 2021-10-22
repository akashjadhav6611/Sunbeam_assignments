package com.app.fruits;

public class Mango extends Fruit
{
	public Mango() 
	{
		super();
	}

	public Mango(String name, String color, double weight) 
	{
		super(name, color, weight);
	}
	
	public String taste()
	{
		return "sweet";
	}

	public void pulp()
	{
		System.out.println("Name : "+super.getName()+" Color : "+super.getColor()+" : creating  pulp!");
	}

}
