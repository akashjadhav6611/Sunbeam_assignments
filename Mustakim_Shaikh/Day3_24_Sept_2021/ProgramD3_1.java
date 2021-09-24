// Program1 Assignment Day 03. 24_Sept_2021.

package SunbeamAssignments;

//This is Rectangle class:

 class Rectangle {

		int length , breadth , area;
		
		Rectangle(int length , int breadth){
			
			this.length = length;
			this.breadth = breadth;
			
		}
	
//Method to calculate area:		
		void Area() {
			
			area = length * breadth;
			System.out.println("Length and Breadth of Rectangle is: " +length+ " " +breadth);
			System.out.println("Area of Rectangle is: " +area);
		}
		
		
	}

// This is main class:
 public class ProgramD3_1{
	 
	 public static void main(String[] args) {
		 
// Creating object of Rectangle and passing Len. and Brea. as parameters.		 
		 Rectangle r1 = new Rectangle(4,5);
		 Rectangle r2 = new Rectangle(5,8);

//calling method Area():		 
		 r1.Area();
		 r2.Area();
	 }
	 
 }