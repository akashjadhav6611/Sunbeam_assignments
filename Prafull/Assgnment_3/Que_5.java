/*
 * Create a class Vehicle. The class should have two fields- 
 * no_of_seats and no_of_wheels. Create facilitator function to 
 * display number of seats and number of wheels. Create two objects 
 * and initialize the fields using constructor.
 * */

class Que_5 {

	public static void main(String args[])
	{

		Vehicle v1 = new Vehicle("2", "4");
		Vehicle v2 = new Vehicle("6", "6");
		
		System.out.println("Vehicle One Number of Seats: " + v1.getNumber_of_seats() + "\nVehicle One Number of Wheels: " + v1.getNumber_of_wheels());
		System.out.println("Vehicle Two Number of Seats: " + v2.getNumber_of_seats() + "\nVehicle Two Number of Wheels: " + v2.getNumber_of_wheels());
	}
}


class Vehicle {

	
	public String number_of_seats;
	public String number_of_wheels;

	// Vehicle class constructor
	
	Vehicle(String number_of_seats, String number_of_wheels)
	{
		this.number_of_seats = number_of_seats;
		this.number_of_wheels = number_of_wheels;
	}
	
	public String getNumber_of_seats() {
		return number_of_seats;
	}

	public String getNumber_of_wheels() {
		return number_of_wheels;
	}

	
	
}
