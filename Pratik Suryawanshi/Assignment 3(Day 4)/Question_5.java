//Create a class Vehicle. The class should have two fields-no_of_seats and no_of_wheels.
//Create facilitator function to display number of seats and number of wheels.
//Create two objects and initialize the fields using constructor.

package question_5;

class Vehicle{
	private int no_of_seats;
	private int no_of_wheels;
	public Vehicle(int nseats, int nwheels) {
		this.no_of_seats = nseats;
		this.no_of_wheels = nwheels;
	}
	public void Disp() {
		System.out.print("      No of Seats: "+no_of_seats);
		System.out.println("    No of Wheels: "+no_of_wheels);
	}
	}
	


public class Main {

	public static void main(String[] args) {
		int seats,wheels;
		Vehicle v1=new Vehicle(23,45);
		System.out.print("First Vehicle: ");
		v1.Disp();

		Vehicle v2=new Vehicle(78,87);
		System.out.print("Second Vehicle:");
		v2.Disp();


	}

}
