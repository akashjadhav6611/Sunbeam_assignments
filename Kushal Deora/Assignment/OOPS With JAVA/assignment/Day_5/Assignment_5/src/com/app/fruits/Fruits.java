package com.app.fruits;

public class Fruits {
private String name;
private double weight;
private String color;
private boolean isFresh;

public Fruits(String name,double weight, String color) {

	this.name = name;
	this.weight=weight;
	this.color=color;
	this.isFresh=true;
	
}
public String getName()
{
	return this.name;
}

public boolean getisFresh()
{
	return this.isFresh;
}

public void setisFresh()
{
	this.isFresh=false;
}
public String taste()
{
	return "no specific taste";
}

public String toString()
{
	return "Name:"+this.name+" "+"Weight: "+this.weight+" Color: "+this.color;
}
}
