//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively 
//by creating a class named 'Rectangle' with a method named 'Area' 
//which returns the area and length and breadth passed as parameters to its constructor.

package question_4;

import java.util.Scanner;
class Rectangle{
	private float length;
	private float breadth;
	public float area_rec;
	

	public Rectangle(float len, float bre) {
		this.length = len;
		this.breadth = bre;
	}

	public float Area() {
	
		area_rec=length*breadth;
		return area_rec;
		
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		float rec_Area;
		Rectangle rec=new Rectangle(4,5);
		rec_Area=rec.Area();
		System.out.println("Area of First Rectangle: "+rec_Area);
		
		Rectangle rec1=new Rectangle(5,8);
		rec_Area=rec1.Area();
		System.out.println("Area of Second Rectangle: "+rec_Area);			

	}

}
