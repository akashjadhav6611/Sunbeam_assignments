package com.app.geometry;

//import java.lang.Math;


public class Point2D
{
private  int x;
private int y;
    public Point2D(int x,int y)
    {
        this.x=x;
        this.y=y;

    }
    public String getDetails()
    {
        return "Co-ordinates X: "+this.x+" Y: "+this.y;
    }

    public boolean isEqual(Point2D p)
    {
            return this.x==p.x&&this.y==p.y;
    }

    public double calculateDistance(Point2D p2)
    {
      return (Math.sqrt(Math.pow(p2.x-this.x,2)+Math.pow(p2.y-this.y,2)));
    }
    
}
