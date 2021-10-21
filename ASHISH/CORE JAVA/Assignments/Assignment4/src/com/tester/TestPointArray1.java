package com.tester;
import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many points do you want to Enter?");
		
		Point2D[] p = new Point2D[sc.nextInt()];
		
		for(int i=0; i<p.length; i++)
		{
			System.out.println("Enter x and y coordinates respectively:");
			p[i] = new Point2D(sc.nextInt(), sc.nextInt());
		}
		
		boolean exit = false;
		
		while(!exit)
		{
			System.out.println("\nEnter the number of your choice:\n1. Display details of a specific point\n2. Display x, y co-ordinates of all points\n3. User i/p : 2 indices for the points , validate the indices\r\n"
					+ "Display distance between specified points (iff they are not located at the same position)\n4. Exit");
			
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("\nEnter index value: ");
				int i = sc.nextInt();
				
				if(i >= p.length || i < 0)
				{
					System.out.println("Invalid index, please retry!!!!");
				}
				else
				{
					System.out.println("Index number " + i + " " + p[i].getDetails());
				}
				break;
			case 2:
				System.out.println("x, y co-ordinates of all points");
				int count = 0;
				for(Point2D point : p)
				{
					System.out.println("Point for index " + count + " " + point.getDetails());
					count++;
				}
				break;
			case 3:
				System.out.print("Enter index value: ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				if(a<0 || a>p.length || b<0 || b>p.length)
				{
					System.out.println("Numbers are not in range of index!!!!");
					break;
				}
				else
				{
					System.out.println(p[a].isEqual(p[b]) ? "Both the points are at same position" : "The value of distance between both the points of both the indexes is " + Point2D.calculateDistance(p[a], p[b]));
					break;
				}
			case 4:
				exit = true;
				break;
			}
		}
		sc.close();
	}
	
	
}
