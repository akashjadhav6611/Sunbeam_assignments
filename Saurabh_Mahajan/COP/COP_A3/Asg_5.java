package sunbeam;

class Vehicle
{
	private int no_of_seats;
	private int no_of_wheels;
	
	Vehicle()
	{
		this.no_of_seats = 0;
		this.no_of_wheels = 0;
	}
	
	Vehicle(int no_of_seats, int no_of_wheels)
	{
		this.no_of_seats = no_of_seats;
		this.no_of_wheels = no_of_wheels;
	}

	public int getNo_of_seats() {
		return no_of_seats;
	}

	public int getNo_of_wheels() {
		return no_of_wheels;
	}
}

public class Asg_5 
{
	public static void main(String[] args) 
	{
		Vehicle V1 = new Vehicle();
		Vehicle V2 = new Vehicle(7,4);
		
		System.out.println("No. of Seats in V1 : "+V1.getNo_of_seats()+"\nNo. of Wheels in V1 : "+V1.getNo_of_wheels());
		System.out.println("No. of Seats in V2 : "+V2.getNo_of_seats()+"\nNo. of Wheels in V2 : "+V2.getNo_of_wheels());
	}
}
