package com.app.fruits;

public class Apple extends Fruits
{

	public Apple(String name, double weight, String color) {
		
		super(name,weight,color);
	
	}
	 public void jam() {
	//	 Display name of the fruit : making jam!
		 System.out.println("Name: "+super.getName());
		 }
	public String taste()
	{
		return "sweet n sour";
	}
	
}
