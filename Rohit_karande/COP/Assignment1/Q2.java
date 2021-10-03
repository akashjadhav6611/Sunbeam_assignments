package Asm;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radious");
		int r;
		r= sc.nextInt();
		System.out.println("radius= "+r);
		double Area,Circumferance;
		double pi= Math.PI;
		Area=pi*r*r;
	    Circumferance=2*pi*r;
	    
	    System.out.println("Area= "+Area);
	    System.out.println("circumferance= "+Circumferance);
	sc.close();
	}	
	}

