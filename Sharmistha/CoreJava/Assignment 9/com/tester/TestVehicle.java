package com.tester;
import com.app.vehicles.Vehicle;
import java.util.Scanner;
public class TestVehicle {
	public static void main (String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Vehicles : ");
	@SuppressWarnings("unused")
	Vehicle v1 = new Vehicle(0, sc.next(), sc.nextDouble(), null, null);
	Vehicle v2 = new Vehicle(0, sc.next(), sc.nextDouble(), null, null);
	System.out.println(v1.toString());
	System.out.println(v2.toString());
	if(v1.equals(v2))
	{
		System.out.println("same");
	}
	else
	{
		System.out.println("Different");
	}
			
	}
}
