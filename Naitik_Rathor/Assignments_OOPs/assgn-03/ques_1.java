class Rectangle{
	int length;
	int breadth;
	int Area() {
		return length*breadth;
	}
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}	
}
public class ques_1 {

	public static void main(String[] args) {
		Rectangle r1 =null;
		Rectangle r2=null;
		r1 =new Rectangle(4,5);
		r2= new Rectangle(5,8);
		System.out.println("First Area Of Rectangle: "+r1.Area());
		System.out.println("Second Area Of Rectangle: "+r2.Area());

	}

}
