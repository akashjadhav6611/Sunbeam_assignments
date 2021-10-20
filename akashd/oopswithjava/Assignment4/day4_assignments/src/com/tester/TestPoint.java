package com.tester;
import com.app.geometry.Point2D;

class TestPoint {
	public static void main(String args[]) {
		Point2D point1 = new Point2D(10.5, 5.25); // define point 1
		System.out.println(point1.getDetails()); // print point 1
		Point2D point2 = new Point2D(10.5, 5.25); // define point 2
		System.out.println(point1.getDetails()); // print point 2
		System.out.println(point1.isEqual(point2)); // check equal
		System.out.println(point1.calculateDistance(point2)); // calculate distance between p1 and p2
	}
}