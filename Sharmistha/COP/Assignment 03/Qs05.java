package Assignment03;

import java.util.*;
class Vehicle {
	public int no_of_seats;
	public int no_of_wheels;


Vehicle(int no_of_seats,int no_of_wheels)
{
	this.no_of_seats= no_of_seats;
	this.no_of_wheels= no_of_wheels;
}

public int getno_of_seats() {
	return no_of_seats;
}

public int getno_of_wheels() {
	return no_of_wheels;
}
}
public class Qs05 {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle(4, 6);
		Vehicle v2 = new Vehicle(8, 10);
		
		System.out.println("Vehicle One Number of Seats: " + v1.getno_of_seats() + "\nVehicle One Number of Wheels: " + v1.getno_of_wheels());
		System.out.println("Vehicle Two Number of Seats: " + v2.getno_of_seats() + "\nVehicle Two Number of Wheels: " + v2.getno_of_wheels());
		//System.out.println("Number of Wheels : " +v1.no_of_wheels);
		// TODO Auto-generated method stub

	}

}
