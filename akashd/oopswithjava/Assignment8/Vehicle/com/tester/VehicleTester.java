package com.tester;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

public class VehicleTester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 2 Vehicle details");
			System.out.println("In the format: color, prive, regNo");
			System.out.println("First vehicle details");
			//Vehicle v1 = new Vehicle(sc.next(), sc.nextDouble(), sc.next());
			Vehicle v1 = new Vehicle(1, "Red", 30000, "abcd123"); // quick add
			System.out.println("Second vehicle details");
			//Vehicle v2 = new Vehicle(sc.next(), sc.nextDouble(), sc.next());
			Vehicle v2 = new Vehicle(2, "Green", 10000, "abcd123"); // quick add
			
			System.out.println(v1.toString());
			System.out.println(v2.toString());
			
			System.out.println(v1.equals(v2));
		}

	}


}
