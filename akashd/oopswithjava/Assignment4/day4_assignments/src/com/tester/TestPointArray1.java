package com.tester;
import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPointArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Point2D pointArray[];
		
		// Accept , how many no of points to plot from user.
		System.out.println("How many points to plot?");
		
		// Create suitable data structure
		pointArray = new Point2D[sc.nextInt()];
		
		// Prompt user for x & y co ordinates n store the data suitably 
		for(int i = 0; i < pointArray.length; i++) {
			System.out.println("Enter point " + i + " coordinates x and y:");
			pointArray[i] = new Point2D(sc.nextDouble(), sc.nextDouble());
		}
		
		// Supply Menu to user
		boolean exit = false;
		int ch = 0;
		
		while(!exit) {
			System.out.println("Menu: ");
			System.out.println("1. Display details of a specific point: ");
			System.out.println("2. Display x ad y coordin-ates of all points");
			System.out.println("3. Distance between 2 points");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			switch(ch) {
			case 1: // Display details of a specific point
				System.out.println("Enter point index");
				int pointIndex = sc.nextInt();
				if(pointIndex < pointArray.length && pointIndex >= 0) {
					// display point data
					System.out.println("Point " + pointIndex + " is at (" + pointArray[pointIndex].getX() + "," + pointArray[pointIndex].getY() + ").");
				} else {
					System.out.println("Invalid point index!");
				}
				break;
			case 2: // Display x, y co-ordinates of all points
				for(Point2D point : pointArray) {
					System.out.println(point.getDetails());
				}
				break;
			case 3:
				System.out.println("Enter two indexes to compare");
				int index1 = sc.nextInt();
				int index2 = sc.nextInt();
				if(index1 >= 0 && index1 < pointArray.length && index2 >= 0 && index2 < pointArray.length) {
					System.out.println("The distance between these 2 points are : " + pointArray[index1].calculateDistance(pointArray[index2]));
				} else {
					System.out.println("Invalid indexes!");
				}
				break;
			case 4:
				exit = true;
				break;
			default:
				System.out.println("Invalid choice!");
			}
		}
		
		sc.close();
	}

}
