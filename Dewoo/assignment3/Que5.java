package assignment3;

class Vehicle{
	int number_seats;
	int no_of_wheels;
	
	public Vehicle(int number_seats, int no_of_wheels) {
		super();
		this.number_seats = number_seats;
		this.no_of_wheels = no_of_wheels;
	}
	
	void display() {
		System.out.println("no_of_wheels: "+this.number_seats+" no_of_wheels: "+this.no_of_wheels);
	}
}

public class Que5 {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle(5, 4);
		Vehicle v2 = new Vehicle(2, 2);
		
		v1.display();
		v2.display();

	}

}
