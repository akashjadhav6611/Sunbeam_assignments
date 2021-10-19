package com.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Point 1 co-ordinates : x1 y1 ");
        Point2D p1 = new Point2D(sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter Point 2 co-ordinates : x2 y2 ");
        Point2D p2 = new Point2D(sc.nextDouble(), sc.nextDouble());

        System.out.println(p1.getDetails());
        System.out.println(p2.getDetails());

        if (p1.isEqual(p2)) 
            System.out.println("p1 and p2 are loacted at same position");
        else
        {
            System.out.println("p1 and p2 are loacted at different position");
            System.out.println("Distance between p1 and p2 : "+p1.calculateDistance(p2)+" units");
        }

        sc.close();
    }
}