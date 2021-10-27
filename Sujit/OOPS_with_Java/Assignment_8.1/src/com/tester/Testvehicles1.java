package com.tester;

import java.util.Scanner;

import com.app.vehicles.Vehicles;

public class Testvehicles1 {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter 1st vehicle details : chasis no clr price");
			Vehicles v1 = new Vehicles(sc.nextInt(), sc.next(), sc.nextDouble());
			System.out.println("Enter 2nd vehicle details :  chasis no clr price");
			Vehicles v2=new Vehicles(sc.nextInt(), sc.next(),sc.nextDouble());
			
			System.out.println(v1.equals(v2)?"SAME" :"DIFFERENT");
			
		}
	}
}
