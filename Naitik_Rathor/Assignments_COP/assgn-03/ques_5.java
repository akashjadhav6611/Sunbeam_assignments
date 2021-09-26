
public class ques_5 {

	public static void main(String[] args) {
		vehicle v1 = new vehicle(2,1);
		vehicle v2=new vehicle(5,0);
		System.out.println("Number of seats: "+v1.getNo_seats()+" Number of wheels: "+v1.getNo_wheels());
		System.out.println("Number of seats: "+v2.getNo_seats()+" Number of wheels: "+v2.getNo_wheels());
	}

}

class vehicle{
	private int no_seats;
	private int no_wheels;
	
	public vehicle(int no_seats, int no_wheels) {
		this.no_seats = no_seats;
		this.no_wheels = no_wheels;
	}
	
	
	public int getNo_seats() {
		return no_seats;
	}

	public int getNo_wheels() {
		return no_wheels;
	}

}