import java.util.Scanner;

public class Assi2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of radius: ");
		
		double r = sc.nextFloat();
		
		double area = Math.PI*r*r;
		
		double circumference= 2*Math.PI*r;
		
		
		System.out.printf("\nArea of Circle: %.2f ",area);
		System.out.printf("\nCircumference of circle:%.2f ",circumference);
		
		
		
		

	}

}
