package com.app.geometry;
import java.lang.Math;


public class Point2D{

    private double x,y;

    public Point2D(double x,double y){
        this.x = x;
        this.y = y;

    }
    public String getDetails(){
        return "Point x is : "+this.x+"    Point y is : "+this.y ;
    }

    public boolean isEqual(Point2D obj){
        return (this.x==obj.x && this.y==obj.y);
    }

    public double calculateDistance(Point2D obj){
        return (Math.sqrt((Math.pow((obj.x-this.x),2))+(Math.pow((obj.y-this.y),2))));
    }

}