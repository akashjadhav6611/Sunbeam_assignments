package Assign31;



class rectangle{
	int length;
	int breadth;
	
	rectangle(int l ,int b){
		this.length = l;
		this.breadth = b;
	}
	public int area(){
		return length*breadth;
	}
}
public class Ass3_1 {

	public static void main(String[] args) {
		
		rectangle vals1 = new rectangle(4,5);
		rectangle vals2 = new rectangle(5,8);
		
		System.out.println("Area of rectangle with sides (4,5) is"+(vals1.area()));
		System.out.println("Area of rectangle with sides (5,8) is"+(vals2.area()));
	}

}
