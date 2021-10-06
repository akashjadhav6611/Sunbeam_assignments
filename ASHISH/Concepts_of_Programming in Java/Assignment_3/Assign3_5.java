package sunbeam;

class Vehicle
{
	 int no_of_seats;
	 int no_of_wheels;
	
	Vehicle(int no_of_seats, int no_of_wheels)
	{
		this.no_of_seats = no_of_seats;
		this.no_of_wheels = no_of_wheels; 
	}
	
	void show_no_of_seats()
	{
		System.out.print("Number of Seats:"+no_of_seats);
	}
	
	void show_no_of_wheels()
	{
		System.out.println("\tNumber of Wheels:"+no_of_wheels);
	}
}
public class Assign3_5 {

	public static void main(String[] args) 
	{
		Vehicle v1 = new Vehicle(4,4);
		Vehicle v2 = new Vehicle(6,4);
		
		System.out.print("VEHICLE ONE-> ");
		v1.show_no_of_seats();
		v1.show_no_of_wheels();
		
		System.out.print("VEHICLE TWO-> ");
		v2.show_no_of_seats();
		v2.show_no_of_wheels();
		
	}

}
