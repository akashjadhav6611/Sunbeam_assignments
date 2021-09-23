package ass_1_2;

import java.util.Scanner;

public class ass1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radi;
		float area ,cir;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius");
		radi = sc.nextInt();
		area = 3.14f * radi*radi;
		cir = 2* 3.14f * radi;
		System.out.println("For radius = "+radi);
		System.out.println("Area of cicle = "+area);
		System.out.println("circumference of circle = "+cir);
		
	}

}
