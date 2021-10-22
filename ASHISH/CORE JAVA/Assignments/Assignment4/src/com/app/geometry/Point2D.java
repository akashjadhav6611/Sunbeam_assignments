package com.app.geometry;

import java.lang.Math;

public class Point2D {
    private double x,y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getDetails() {
        return "X co-ordinate's value : " + x + "   Y co-ordinate's value : " + y;
    }

    public boolean isEqual(Point2D point2) {
        return x == point2.x && y == point2.y;
    }

    public static double calculateDistance(Point2D p1, Point2D p2) {
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }
}