package com.app.fruits;

public class Orange extends Fruit{

	public Orange(String name, String color, double weight) {
		super(name, color, weight);
	}

	public String taste() {
		return "Sour";
	}

	public String toString() {
		return "Orange " + super.toString();
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public String getColor() {
		return super.getColor();
	}

	public void juice() {
		System.out.println("Fruit name is " + getName() + ", color is " + getColor() + ", extracting juice!");
	}
}
