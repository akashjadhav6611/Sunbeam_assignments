package sunbeam;

class Rectangle
{
	private int length;
	private int breadth;
	private int area;
	
	Rectangle(int i, int j)
	{
		length = i;
		breadth = j;
	}
	
	int Area()
	{
		return length*breadth;
	}
}

public class Assign3_1 {
		
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(45,20);
		
		System.out.println("The area of the rectangle r1 is "+(r1.Area()));
		System.out.println("The area of the rectangle r2 is "+(r2.Area()));
	}
}
