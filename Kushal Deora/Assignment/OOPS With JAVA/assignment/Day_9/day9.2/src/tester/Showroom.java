package tester;

import static utils.ValidationRules.*;

import java.util.Scanner;

import com.app.vehicle.Vehicle;

import custom_exception.VehicleHandlingException;

public class Showroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(" Enter Showroom capacity");
			Vehicle[] vehicles = new Vehicle[sc.nextInt()];
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				System.out.println("1. Add Vehicles 2. Display all Vehicles 0. Exit");

				try {
					switch (sc.nextInt()) {
					case 1:
						if(counter<vehicles.length)
						{
							System.out.println(
									"Enter vehicle details : chasisNo,  color,  price,  " + "manufactureDate(yr-mon-day),  category");
							Vehicle v =new Vehicle(checkForDuplicate(sc.next(),vehicles), sc.next(), sc.nextDouble(), parseAndValidateManufactureDate(sc.next()),sc.next());
							vehicles[counter++]=v;
							System.out.println("Vehicle Added");
						}
						else
							throw new VehicleHandlingException("Showroom Full");

						break;
					case 2:
						for(Vehicle v:vehicles)
							if(v!=null)
								System.out.println(v);
						break;

					case 0:
						exit = true;
						break;

					}

				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}

		}
	}

}
