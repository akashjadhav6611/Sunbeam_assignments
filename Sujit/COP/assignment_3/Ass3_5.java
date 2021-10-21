class Vehicle{
    String no_of_seats;
    String no_of_wheels;
	
	
	public Vehicle(String no_of_seats, String no_of_wheels) {
		super();
		this.no_of_seats = no_of_seats;
		this.no_of_wheels = no_of_wheels;
	}


	public String getNo_of_seats() {
		return no_of_seats;
	}

	public String getNo_of_wheels() {
		return no_of_wheels;
	}
	
}



public class Ass3_5 {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("4","4");
		Vehicle v2 = new Vehicle("6","8");
		
		System.out.println("No of seats of V1 = "+v1.getNo_of_seats()+"\nNo of wheels of V1 = "+v1.getNo_of_wheels());
		System.out.println("No of seats of V2 = "+v2.getNo_of_seats()+"\nNo of wheels of V2 = "+v2.getNo_of_wheels());
	}
}
