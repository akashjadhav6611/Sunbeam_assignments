package com.app.showroom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import com.app.exceptions.VehicleValidationException;
import com.app.vehicles.Vehicle;
/*Objective : Use exception handling , string handling & Date in vehicle showroom based scenario
Vehicle's  state(attributes) --chasisNo : int , color : String ,category:string, price : double , manufactureDate(Date)
Add validation rules for the inputs : 
chasisNo id unique
category  : Petrol , Diesel, EV , Hybrid , CNG
manufactureDate : in this financial year (1st Apr 2021 to 31Mar 2022) 

Create a tester as Showroom.
Options
1. Add Vehicle 
Apply all validation rules . In case of success , add the vehicle in the showroom
Otherwise raise custom exception , alert user using exc handling.

2. Display All Vehicles

3. Exit*/

public class Showroom {
	public static void menu() {
		System.out.println("1.Add vehicle");
		System.out.println("2.Display all vehicles");
		System.out.println("3.Exit");
	}

	public static void main(String[] args) {
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		Vehicle[] vehicles = new Vehicle[4];
		Vehicle tempVehicle;
		int counter = 0;
		Date mfrDate;
		Date lowerLimit;
		Date upperLimit;
		String category;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		while (!exit) {
			try {
				lowerLimit = sdf.parse("01-04-2021");
				upperLimit = sdf.parse("31-03-2022");
				menu();
				System.out.println("Enter choice : ");
				switch (sc.nextInt()) {
				case 1:
					if (counter < vehicles.length) {
						System.out.println(
								"Enter vehicle details: chassisNo color price category manufacturingDate (dd-mm-yyyy)");
						tempVehicle = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble(), category = sc.next(),
								mfrDate = sdf.parse(sc.next()));
						// Check for manufacturing date
						if (mfrDate.before(lowerLimit) || mfrDate.after(upperLimit))
							throw new VehicleValidationException(
									"Manufacturing date not in the current financial year");

						// check for category
						if (!(category.toLowerCase().equals("petrol") || category.toLowerCase().equals("diesel")
								|| category.toLowerCase().equals("ev") || category.toLowerCase().equals("hybrid")
								|| category.toLowerCase().equals("cng")))
							throw new VehicleValidationException("Invalid Category");

						// check for chassis number uniqueness
						for (Vehicle v : vehicles) {
							if (v != null) {
								if (tempVehicle.equals(v))
									throw new VehicleValidationException("Duplicate chassis number!!");
							}
						}
						vehicles[counter++] = tempVehicle;
						System.out.println("Vehicle added Successfully!!");
					} else
						System.out.println("Showroom is Full!!");
					break;

				case 2:
					if (counter == 0)
						System.out.println("Showroom is empty!!");
					else
						for (Vehicle v : vehicles) {
							if (v != null)
								System.out.println(v);
						}
					break;
				case 3:
					exit = true;
					break;
				default:
					System.out.println("Invalid choice!!");
					break;
				}
			} catch (ParseException e) {
				System.err.println(e.getMessage());
			} catch (VehicleValidationException e) {
				System.err.println(e.getMessage());
			}
		}
		sc.close();
	}
}
