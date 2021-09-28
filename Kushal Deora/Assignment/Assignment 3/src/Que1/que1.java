package Que1;
class Rectangle
{private int l;
private int b;
Rectangle(int l, int b)
{
	this.l=l;
	this.b=b;
}
	public int area()
	{
		return (l*b);
	}
}
public class que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle(4,5);
		Rectangle r2=new Rectangle(5,8);
		int rs= r1.area();
		System.out.println("Area:" +rs);
		 rs= r2.area();
		System.out.println("Area2:" +rs);
	}

}
