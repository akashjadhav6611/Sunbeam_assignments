package Que2;

import java.util.Scanner;

public class que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter the radius");
int r = sc.nextInt();
double area = Math.PI*r*r;
double crf= Math.PI*2*r;
System.out.println("Area: "+area+ " Circumference: "+crf);
	}

}
