package com.tester;
import com.app.geometry.Point2D;

import java.util.*;

public class TestPoint{

    public static void main(String[] args){

        Scanner sm = new Scanner(System.in);

        System.out.println("Enter the point1 Details: x and y ");
        Point2D point1 = new Point2D(sm.nextDouble(), sm.nextDouble());
        System.out.println(point1.getDetails());

        System.out.println("Enter the point2 Details: x and y ");
        Point2D point2 = new Point2D(sm.nextDouble(), sm.nextDouble());
        System.out.println(point2.getDetails());

        System.out.print(point1.isEqual(point2)? "Both Same" : "Both Different : And Distance is: "+point1.calculateDistance(point2));
   
        sm.close();
   
    }


}