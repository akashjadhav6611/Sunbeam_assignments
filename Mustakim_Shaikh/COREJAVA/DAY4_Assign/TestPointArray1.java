package com.tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {

		Scanner sm = new Scanner(System.in);
		
		System.out.println("Enter no of points to be plotted : ");
		Point2D[] points;
		points = new Point2D[sm.nextInt()];
		
		
		for(int i = 0; i < points.length; i++){
			System.out.println("Enter co-ordinates of point "+i+" : 'x' and 'y' ");
			points[i] = new Point2D(sm.nextDouble(), sm.nextDouble());
		}
		
		int ch;
		
		System.out.println("1.Details point 2.co-ordinates 3.check 4.Exit");
		
		do {
			
			System.out.println("\nEnter choice : ");
		    ch = sm.nextInt();
		
			switch (ch) {
				case 1:
					System.out.println("Enter index of the point : ");
					int index = sm.nextInt();
					if(index < points.length)
					   System.out.println(points[index].getDetails());
					else
						System.out.println("Abe Saale...!!!");
					break;
					
				case 2:
					for(Point2D p : points)
						System.out.println(p.getDetails());
					break;
					
				case 3:
					System.out.println("Enter indices of two points: point1 and point2");
					int point1 = sm.nextInt();
					int point2 = sm.nextInt();
					
					if(point1 < points.length && point2 < points.length)
						
					 System.out.print(points[point1].isEqual(points[point2])? "Both Same" : "Both Different : And Distance is: "+(points[point1].calculateDistance(points[point2])));
					else
						System.out.println("Abe Saale...!!!!!!!!");
				
				case 4:
					if(ch == 4)
					System.out.println("Khatam , Tata , Bye -Bye !!!!");
					break;
					
				default:
					System.out.println("Abe Saale...!!!!");
					break;
			}

		}while(ch != 4);

		sm.close();

	}
}		