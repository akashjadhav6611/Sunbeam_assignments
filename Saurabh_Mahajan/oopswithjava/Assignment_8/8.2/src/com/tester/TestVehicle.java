package com.tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.app.vehicles.*;
import com.exception.*;
import com.validation.ValidateVehicle;

public class TestVehicle 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of vehicles : ");
		Vehicle[] vehicle = new Vehicle[scan.nextInt()];
		boolean key = true;
		int counter = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		while(key)
		{
			try
			{
				System.out.println("\n1. Add a vehicle");
				System.out.println("2. Display all vehicles");
				System.out.println("3. Exit");
				System.out.println("Enter the choice : ");
				switch (scan.nextInt()) 
				{
					case 1:
						System.out.println("Enter vehicle details:");
						System.out.println("Chassis Number: ");
						int chasisno = scan.nextInt();
						ValidateVehicle.validateChasisNo(chasisno, vehicle);
						System.out.println("Color : ");
						String color = scan.next();
						System.out.println("Price : ");
						Double price = scan.nextDouble();
						System.out.println("Manufacutre date: dd-MM-yyyy");
						String mfgDate = scan.next();
						ValidateVehicle.validateDate(mfgDate);
						System.out.println("Category : ");
						String category = scan.next();
						ValidateVehicle.validateCategory(category);
						vehicle[counter++] = new Vehicle(chasisno, color, category, price, sdf.parse(mfgDate));
						break;
					
					case 2:
						for(Vehicle v : vehicle)
							if(v!=null)
								System.out.println(v);
						break;
						
					case 3:
						System.out.println("Exited the program !!!");
						key = false;
						break;
						
					default:
						System.out.println("Invalid choice !!!");
						break;
				}
			}
			catch (ParseException p) 
			{
				System.out.println(p);
			} 
			catch (ManufactureDateOutOfRangeException d) 
			{
				System.out.println(d);
			} 
			catch (DuplicateChasisNoException c) 
			{
				System.out.println(c);
			} 
			catch (InvalidCategoryException cat) 
			{
				System.out.println(cat);
			}
			catch (Exception e) 
			{
				System.out.println(e);
			}
			
		} 
		
		
		scan.close();

	}

}
