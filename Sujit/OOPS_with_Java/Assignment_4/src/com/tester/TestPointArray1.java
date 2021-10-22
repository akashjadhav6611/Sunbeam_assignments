package com.tester;
import java.util.Scanner;

import com.app.geometry.Point2D;


public class TestPointArray1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of points :");
        Point2D[] point;
        point =new Point2D[sc.nextInt()];

        for(int i = 0; i< point.length ; i++){
            System.out.println("Enter X and Y co-ordinates for "+(i+1)+" point :");
            point[i] = new Point2D(sc.nextDouble(),sc.nextDouble());

        }

        boolean key = true;

        do{
            System.out.println("\n1. Display details of specific point");
			System.out.println("2. Display co-ordinates of all points");
			System.out.println("3. Validate 2 points");
			System.out.println("4. Exit");
			System.out.println("\nEnter choice : ");
			int choice;
			choice = sc.nextInt();

            switch (choice)
            {
             case 1:   System.out.println("Enter Index of point : ");
                       int index = sc.nextInt();
                       System.out.println(point[index].getDetails());
                       break;

              case 2:   for(Point2D p : point)
                        System.out.println(p.getDetails());
                        break;  
                        
                        case 3:
                        System.out.println("Enter indices of two points : p1 p2");
                        int p1 = sc.nextInt();
                        int p2 = sc.nextInt();
                        
                        if(p1 >= 0 && p1 <= point.length && p2 >= 0 && p2 <= point.length)
                        {
                            System.out.println("Point 1: "+point[p1].getDetails());
                            System.out.println("Point 2: "+point[p2].getDetails());
    
                            if (point[p1].isEqual(point[p2])) 
                                System.out.println("Point 1 and Point 2 are loacted at same position");
                            else
                            {
                                System.out.println("Point 1 and Point 2 are loacted at different position");
                                System.out.println("Distance between p1 and p2 : "+point[p1].calculateDistance(point[p2])+" units");
                            }
                        }
                        else
                            System.out.println("Invalid index , pls retry!!!");
                        
                        break;	
                    
                    case 4:
                        System.out.println("Exited the program !!!");
                        key = false;
                        break;
                        
                    default:
                        System.out.println("Enter valid input !!!");
                        break;          
            }

        }while(key);
        sc.close();
    }
}
