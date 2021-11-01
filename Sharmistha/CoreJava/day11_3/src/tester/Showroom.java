package tester;

import java.util.Date;
import java.util.Scanner;

import com.app.vehicles.Vehicle;
import static utils.ValidationRules.*;

import custom_exceptions.VehicleHandlingException;

public class Showroom {

	public static void main(String... args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init pahse of the app
			// create suitable array to hold vehicle details(ref)
			System.out.println("Enter Showroom capacity");
			Vehicle[] vehicles = new Vehicle[sc.nextInt()];// 1 array object
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				System.out.println("1. Add Vehicle 2.Display all vehicles 3.Purchase a vehicle 10.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:// add the vehicle : upon validations
						if (counter < vehicles.length) {
							System.out.println("Enter vehicle details : chasisNo,  color,  price,  "
									+ "manufactureDate(yr-mon-day),  category");
							Vehicle v = new Vehicle(checkForDuplicate(sc.next(), vehicles),
									parseAndValidateColor(sc.next()), sc.nextDouble(),
									parseAndValidateManufactureDate(sc.next()), parseAndValidateCategory(sc.next()));
							// => success
							vehicles[counter++] = v;
							System.out.println("vehicle added to the showroom");
						} else
							throw new VehicleHandlingException("Showroom Full!!!!!");
						break;

					case 2: // display
						System.out.println("Vehicles in the showroom");
						for (Vehicle v : vehicles)
							if (v != null)
								System.out.println(v);
						break;
					case 3 :
						System.out.println("Enter chasis no , to purchase a vehicle");
						//add a finder method to validationrules (jao na udhar!!!!)
						//invoke karo wo method
						Vehicle vehicle = findByChasisNo(sc.next(), vehicles);
						//already bik gayi kya??? : Sold or not
						if(vehicle.getAddress()!= null)// sell hogya hai bhai
						throw new VehicleHandlingException("Vehicle already sold ");
				       //yaha pohocha manjhe available hai 
						System.out.println("Enter delivery address : city, state, country, zipCode");
						vehicle.assignDeliveryAddress(sc.next(), sc.next(), sc.next(), sc.next()); // ho gaya book
						System.out.println("Vehicle ready for delivery ...");
						// ab nahi hai showroom me
					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					// e.printStackTrace();
					System.out.println(e.getMessage());
				}
				// to clear off pending tokens from the buffer of a scanner : till new line
				sc.nextLine();
			}
		}

	}

}
