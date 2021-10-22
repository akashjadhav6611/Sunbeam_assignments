package com.app.fruits;

public class Fruit {

	// data declaration......
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	//Parameterized constructor for initialization........ 
	Fruit(String color,double weight, String name){
		
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = true;
	}
	
	
	//boolean method to return state....
	public boolean isFresh() {
		
		return isFresh;
	}
	
	
	//setter to set fruit is stale or fresh.....
	public void setFresh(boolean isFresh) {
		
		this.isFresh = isFresh;
	}
	
	//getter to return name of fruits:
	public String getName() {
		
		return name;
	}
	
	//getter to get color of fruit.....
	public String getColor() {
		
		return color;
	}
	
	//getter to get weight of fruit...
	public double getWeight() {
		
		return weight;
	}
	
	//taste() method to return taste of fruits override.....
	public String taste() {
		
		return "tell taste";
	}
	
	// toString to display details....
	public String toString() {
		
		return "color = " + color + ", weight = " + weight + " name = " +name ;
	}
	
	
}
