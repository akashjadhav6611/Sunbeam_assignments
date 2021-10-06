//Write a program to print the area of two rectangles having sides (4,5) 
//and (5,8) respectively by creating a class named 'Rectangle' with a 
//method named 'Area' which returns the area and length and breadth 
//passed as parameters to its constructor.

class Rectangle {
	int L;
	int B;
	int area;
	
	 Rectangle(int a, int b){
		this.L=a;
		this.B=b;

	}
	 int area() {
		 area=L*B;
		 return area;
	 }
	
	
}
public class Q1 {

	public static void main(String[] args) {
		Rectangle obj= new Rectangle(3,4);
		Rectangle obj2= new Rectangle(6,5);

		System.out.println("area of 1st rectangle= "+obj.area());
		System.out.println("area of 2nd rectangle= "+obj2.area());


	}

}
