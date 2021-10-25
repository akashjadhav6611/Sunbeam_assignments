package com.app.fruits;

public class Mango extends Fruit{
	
	public Mango(String name, String color, double weight) {
		super(name, color, weight);
	}

	public String taste() {
		return "Sweet";
	}

	public String toString() {
		return "Mango " + super.toString();
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public String getColor() {
		return super.getColor();
	}

	public void pulp() {
		System.out.println("Fruit name is " + getName() + ", color is " + getColor() + ", creating pulp!");
	}
}
