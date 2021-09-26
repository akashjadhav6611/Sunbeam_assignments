package sunbeam;

class Rectangle
{
	private int l;
	private int b;

	Rectangle(int l, int b)
	{
		this.l = l;
		this.b = b;
	}
	
	int area()
	{
		int area = this.b * this.l;
		return area;
	}
	
	void display()
	{
		System.out.println("Length : "+l);
		System.out.println("breadth : "+b);
	}
}

public class Asg_1 
{

	public static void main(String[] args) 
	{
		Rectangle R1 = new Rectangle(4,5);
		Rectangle R2 = new Rectangle(5,8);
		
		R1.display();
		System.out.println("Area : "+(R1.area())+"\n");
		R2.display();
		System.out.println("Area : "+(R2.area()));
	}
}
