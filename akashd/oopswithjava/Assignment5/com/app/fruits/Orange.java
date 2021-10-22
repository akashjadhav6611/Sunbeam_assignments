package com.app.fruits;

public class Orange extends Fruit {
	
	public Orange(String name, String color, double weight) {
		super(name, color, weight);
	}
	
	@Override
	public String taste() {
		return "Sour";
	}
	
	@Override
	public String toString() {
		return getName() + " has " + super.getColor() + " color, " + super.getWeight() + " weight." + " Fresh? " + super.getIsFresh();
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
}
