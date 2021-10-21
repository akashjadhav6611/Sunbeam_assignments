package com.app.geometry;
import java.math.*;

public class Point2D{

 private double x, y;

public Point2D(double x, double y){

    this.x = x;
    this.y = y;

 }

public String getDetails(){

    return "Points on the plane are: " +this.x+ " and " +this.y;
}

public boolean isEqual(Point2D secondPoint){

    return this.x == secondPoint.x && this.y == secondPoint.y;

}

public double calculateDistance(Point2D secondPoint){

    return (Math.sqrt((secondPoint.x- this.x)*(secondPoint.x- this.x) + (secondPoint.y- this.y)*(secondPoint.y- this.y)));

}



}