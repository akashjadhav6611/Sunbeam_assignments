package com.app.fruits;

public class Fruit {
	private String name;
	private String color;
	private double weight;
	private boolean isFresh;
	
	public Fruit(String name, String color, double weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = true;
	}
	
	public String taste() {
		return "No specific taste";
	}
	
	@Override
	public String toString() {
		return "Fruit has " + color + " color, " + weight + " weight.";
	}
	
	public String getColor() {
		return color;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public boolean getIsFresh() {
		return isFresh;
	}
	
	public void setIsFresh(boolean value) {
		isFresh = value;
	}
	
	public String getName() {
		return name;
	}
}
