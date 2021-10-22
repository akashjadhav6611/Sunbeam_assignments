package com.app.fruits;

public class Apple extends Fruit{

	public Apple(String name, String color, double weight) {
		super(name, color, weight);
	}

	public String taste() {
		return "Sweet n Sour";
	}

	public String toString() {
		return "Apple " + super.toString();
	}

	@Override
	public String getName() {
		return super.getName();
	}
	
	
		
}
