package com.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Point 1 coordinates : x1 y1 ");
        Point2D p1 = new Point2D(sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter Point 2 coordinates : x2 y2 ");
        Point2D p2 = new Point2D(sc.nextDouble(), sc.nextDouble());

        System.out.println("Point p1 : " + p1.getDetails() + "\nPoint p2 : " + p2.getDetails());

        System.out.println(p1.isEqual(p2) ? "SAME POSITION" : "DIFFERENT POSITION");

        if(!p1.isEqual(p2))
        {
            System.out.println("Distance between point p1 and p2 is " + Point2D.calculateDistance(p1, p2));
        }

        sc.close();
    }
}