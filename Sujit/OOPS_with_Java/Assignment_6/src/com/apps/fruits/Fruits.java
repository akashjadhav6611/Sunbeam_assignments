package com.apps.fruits;

public class Fruits {

    private String name;
    private String color;
    private double weight;
    private boolean isFresh;

    public Fruits(String name,String color,double weight){

        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isFresh = true;
    }

    public String toString(){
        return "Fruit [ color = "+ color +", weight = "+ weight +", isFresh = "+ isFresh +" ]";
    }
    public String getName(){
        return name;
    }
    public String getColor() {
    	return color;
    }

    public boolean isFresh(){
        return this.isFresh;
    }

    public void setFresh(boolean isFresh){
        this.isFresh = isFresh;
    }

    public String taste(){
        return "no specific taste";
    }
}
