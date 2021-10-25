package com.app.fruits;

public class Fruit {
	private String color, name;
	private double weight;
	private boolean isFresh;
	
	public Fruit(String name, String color, double weight) {
		this.color = color;
		this.name = name;
		this.weight = weight;
		this.isFresh = true;
	}

	@Override
	public String toString() {
		return "[color=" + color + ", name=" + name + ", weight=" + weight + "]";
	}
	
	public String taste() {
		return "No specific taste";
	}

	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean getIsFresh() {
		return isFresh;
	}
	
	public void setIsFresh(boolean value) {
		isFresh = value;
	}
}
