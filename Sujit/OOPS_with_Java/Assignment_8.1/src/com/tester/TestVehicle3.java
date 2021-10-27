package com.tester;

import java.util.Scanner;

import com.app.vehicles.Vehicles;

public class TestVehicle3 {

	public static void main(String[] args)
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter 1st vehicle details : chasis no clr price");
			
			Object v1=new Vehicles(sc.nextInt(), sc.next(),sc.nextDouble());
			System.out.println("Enter 2nd vehicle details :  chasis no clr price");
			Object v2=new Vehicles(sc.nextInt(), sc.next(),sc.nextDouble());
			
			System.out.println(v1.equals(v2)?"SAME":"DIFFERENT");
			String s="hello";
			System.out.println(v1.equals(s)?"SAME":"DIFFERENT");
			System.out.println(v1.equals(null)?"SAME":"DIFFERENT");
		}
		
	}
}
