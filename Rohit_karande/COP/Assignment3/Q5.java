// Create a class Vehicle. The class should have two fields-no_of_seats 
//and no_of_wheels. Create facilitator function to display number of 
//seats and number of wheels. Create two objects and initialize the 
//fields using constructor. 

class vehicle{
	int no_seats ;
	int no_wheels ;
	
	
	vehicle(int a, int b){
		
		this.no_seats=a;
		this.no_wheels=b;
				
	}

	void disp() {
		System.out.println("no of seats ="+no_seats + "      no of wheels = "+no_wheels);


	}
//	public int getNo_seats() {
//		return no_seats;
//	}
//	
//	public int getNo_wheels() {
//		return no_wheels;
//	}



	
	
}
public class Q5 {

	public static void main(String[] args) {
		vehicle bike= new vehicle(1,2);
		
		vehicle car= new vehicle(3,4);
		
		bike.disp();
		car.disp();
		
//		System.out.println("no of seats of bike="+bike.getNo_seats() + "      no of wheels in bike= "+bike.getNo_wheels());
//		
//		System.out.println("no of seats in car="+car.getNo_seats() + "       no of wheels in car= "+car.getNo_wheels());
//

	}

}
