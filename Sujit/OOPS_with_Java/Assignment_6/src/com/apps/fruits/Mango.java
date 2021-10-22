package com.apps.fruits;

public class Mango extends Fruits{

    public Mango(String name,String color , double weight){

        super(name, color, weight);
    }

    public String taste(){
        return "Sweet";
    }
    
    public void pulp() {
    	System.out.println("Name : "+super.getName() +"  color  :"+super.getColor() + "  is Creating Pulp");
    }
}
