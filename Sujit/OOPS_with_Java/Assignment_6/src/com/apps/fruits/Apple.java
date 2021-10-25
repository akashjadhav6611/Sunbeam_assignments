package com.apps.fruits;

public class Apple extends Fruits{

    public Apple(String name, String color, double weight) {
        super(name, color, weight);
        
    }

        public String taste(){
            return "Sweet n Sour";       
            }
        
        public void jam() {
        	System.out.println(super.getName()+" is making jam");
        }
}