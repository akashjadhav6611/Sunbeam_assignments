import java.util.Scanner;

class menu{
	private int num1;
	private int num2;
	public menu(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
	}
	void add() {
		System.out.println("addition of num1 and num2 is : "+(this.num1+this.num2));
	}
	void sub() {
		System.out.println("Substraction of num1 and num2 is : "+(this.num1-this.num2));
	}
	void multi() {
		System.out.println("Multiplication of num1 and num2 is : "+(this.num1*this.num2));
	}
	void div() {
		System.out.println("Division of num1 and num2 is : "+(this.num1/this.num2));
	}
}
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 :");
		int num2 = sc.nextInt();
		menu m1 = new menu(num1 , num2);
		int choice;

		do {
			System.out.println("Enter choice 0:Exit 1:Sum 2:substraction 3:Multiplication 4:Divsion");
			 choice = sc.nextInt();
			switch(choice) {
			
			case 1 : m1.add();
					break;
					
			case 2 : m1.sub();
					 break;
			case 3 : m1.multi();
					 break;
			case 4 : m1.div();
					 break;
			default : System.out.println("Enter valid input");
						break;
			}
		}while(choice!=0);
		
		
	}

}
