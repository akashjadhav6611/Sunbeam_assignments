package assignment3;

class Rectangle{
	int length;
	int breadth;
	
	
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}



	int area() {
		
		return length*breadth;
	}
}

public class Que1 {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(4, 5);
		Rectangle r2 = new Rectangle(5, 8);
		
		int area1=r1.area();
		int area2=r2.area();
		
		System.out.println("Area of Reactangle(Lenghth=4,breadth=5)= "+area1);
		System.out.println("Area of Reactangle(Lenghth=5,breadth=8)= "+area2);

	}

}
