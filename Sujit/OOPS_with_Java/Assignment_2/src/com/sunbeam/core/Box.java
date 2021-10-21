package com.sunbeam.core;

public class Box {
    private double width;
    private double depth;
    private double height;
    private String color;

    public Box(double width,double depth,double height){

        this.width = width;
        this.depth=depth;
        this.height=height;
    }

    public Box(double side){
        this(side,side,side);
    }

    public Box(double width,double depth,double height,String color){
        this(width,depth,height);
        this.color=color;
    }

    public String getBoxDimensions(){

        return "Box Dimensions"+this.width+" "+this.depth+" "+this.height;
    }

    public double getBoxVolume(){

        return width*depth*height;
    }

    public boolean isEqual(Box anotherBox){

        return this.width == anotherBox.width && this.depth==anotherBox.depth && this.height == anotherBox.height;
    }

    public Box createNewBox(double wOff,double dOff,double hOff){

        System.out.println("this hashcode "+this.hashCode());
        Box newBox = new Box(width + wOff,this.depth + dOff , this.height + hOff);
        System.out.println("newbox hashcode "+ newBox.hashCode());
        return newBox;
    }
    public String getColor(){
        return color;
    }
}
