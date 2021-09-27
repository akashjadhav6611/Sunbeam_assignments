
import java.util.Scanner;

public class Asg_2 
{

	private static final double PI = 3.14;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int radius;
		System.out.println("Enter the radius : ");
		radius = sc.nextInt();
		
		System.out.println("Area is : "+(radius*radius));
		System.out.println("Circumference is : "+(radius*2*PI));

	}

}
