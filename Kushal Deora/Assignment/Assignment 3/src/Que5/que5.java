package Que5;

public class que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1=new Vehicle(7,4);
		Vehicle v2=new Vehicle(2,2);
		v1.get_data();
		v2.get_data();
		
	}

}
class Vehicle
{
	private int no_of_seats;
	private int no_of_wheels;
	
	Vehicle(int no_of_seats,int no_of_wheels)
	{
		this.no_of_seats=no_of_seats;
		this.no_of_wheels=no_of_wheels;
	}
	
	void get_data()
	{
		System.out.println("Number of Seats:"+ no_of_seats+" Number of Wheels:"+ no_of_wheels);
	
	}
	
	
}