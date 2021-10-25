package com.apps.fruits;

public class Orange extends Fruits {
 
    public Orange(String name, String color,double weight){

        super(name, color, weight);
    }

    public String taste(){

        return "Sour";
    }
}
