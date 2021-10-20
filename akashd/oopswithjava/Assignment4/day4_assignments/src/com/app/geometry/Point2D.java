package com.app.geometry;

public class Point2D {
	private double x;
	private double y;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String getDetails() {
		return "X: " + x + " Y: " + y;
	}

	public boolean isEqual(Point2D anotherPoint) {
		return (this.x == anotherPoint.x && this.y == anotherPoint.y) ? true : false;
	}

	public double getX() {
		return x;
	}

	
	public double getY() {
		return y;
	}

	public double calculateDistance(Point2D anotherPoint) {
		// distance logic here
		if(!this.isEqual(anotherPoint))
			return Math.sqrt(Math.pow((anotherPoint.getX() - this.x),2) + Math.pow((anotherPoint.getY() - this.y),2));
		else
			return 0;
	}

}