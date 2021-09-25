//Print the area and circumference of a circle, given its radius.
package question_2;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		
		float Area, radius,circumference,pi;
		System.out.println("Enter Radius Of Circle");
		Scanner sc=new Scanner(System.in);
		radius=sc.nextFloat();
		pi= (float) Math.PI;
		
		Area=pi*radius*radius;
		circumference=2*pi*radius;
		
		
		System.out.printf("Area of circle= %.3f\n",Area);
		System.out.printf("circumference of circle= %.3f",circumference);
		
		
		

	}

}
