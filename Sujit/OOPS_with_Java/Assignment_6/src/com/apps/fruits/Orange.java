package com.apps.fruits;

public class Orange extends Fruits {
 
    public Orange(String name, String color,double weight){

        super(name, color, weight);
    }

    public String taste(){

        return "Sour";
    }
    
    public void juice() {
    	System.out.println(super.getName()+" is making juice");
    }
}
