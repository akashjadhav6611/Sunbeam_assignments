package com.tester;

import java.util.Scanner;

import com.app.vehicles.*;

public class TestVehicle 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter vehicle 1 details : Color Price");
		Vehicle v1 = new Vehicle(scan.next(), scan.nextDouble());
		System.out.println("Enter vehicle details : Color Price");
		Vehicle v2 = new Vehicle(scan.next(), scan.nextDouble());
		
		
		if(v1.equals(v2))
			System.out.println("SAME");
				else
					System.out.println("DIFFERENT");

		scan.close();

	}

}
