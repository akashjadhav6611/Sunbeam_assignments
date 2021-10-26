package com.tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.app.vehicles.Vehicle;
import com.exceptions.DateOutOfCurrentYearException;
import com.exceptions.InvalidCategoryException;
import com.exceptions.InvalidChasisException;
import com.utils.CategoryUtils;
import com.utils.DateUtils;
import com.utils.ChasisNumberUtils;

public class Showroom {

	public static void main(String[] args) {
		Vehicle[] showroom = new Vehicle[10];
		int counter = -1;
		
		try(Scanner sc = new Scanner(System.in)) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			boolean exit = false;
			while(!exit) {
				System.out.println("1. Add vehicle");
				System.out.println("2. Display all");
				System.out.println("3. Exit");
				
				switch (sc.nextInt()) {
				case 1: // add vehicle
					System.out.println("Enter vehicle details:");
					// get chassis number, validate and then send
					System.out.println("Chassis Number: ");
					int chassisNumber = ChasisNumberUtils.validateChasisNumber(sc.nextInt(), showroom);
					System.out.println("Color:");
					String color = sc.next();
					System.out.println("Price:");
					Double price = sc.nextDouble();
					System.out.println("Manufacutre date: ");
					String mfgDateString = DateUtils.validateDate(sc.next());
					System.out.println("Category: ");
					String category = CategoryUtils.validateCategory(sc.next());
					showroom[++counter] = new Vehicle(chassisNumber, color, price, sdf.parse(mfgDateString), category); 
					
					break;
				case 2: // display all
					for(Vehicle v : showroom) {
						if (v != null) {
							System.out.println(v);
						}
					}
					break;
				case 3:
					exit = true;
					break;
				default:
					System.out.println("Invalid case, exiting program");
					exit = true;
					break;
				}
			}
		} catch (ParseException p) {
			System.out.println("Couldn't parse date!");
			p.printStackTrace();
		} catch (DateOutOfCurrentYearException d) {
			System.out.println("Couldn't parse date!");
			d.printStackTrace();
		} catch (InvalidChasisException icn) {
			System.out.println("Invalid chasis number, try again!");
			icn.printStackTrace();
		} catch (InvalidCategoryException ice) {
			System.out.println("Invalid chassis name!");
			ice.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error!");
			e.printStackTrace();
		}
	}

}
