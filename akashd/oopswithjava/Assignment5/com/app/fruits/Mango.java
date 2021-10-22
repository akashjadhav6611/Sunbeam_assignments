package com.app.fruits;

public class Mango extends Fruit {
	
	public Mango(String name, String color, double weight) {
		super(name, color, weight);
	}
	
	@Override
	public String taste() {
		return "Sweet";
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
