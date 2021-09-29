package A1;
import java.util.Scanner;

/**********************************************************************
 * Q2. Print the area and circumference of a circle, given its radius.
 **********************************************************************/
public class Q2 
{

	public static void main(String[] args) 
	{
		double A, C;
		int R;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Radius of a circle : ");
		R = sc.nextInt();
		
		A = Math.PI * R * R;
		C = 2 * Math.PI *R;
		
		System.out.println("Area = "+A+" Circumference = "+C);
		sc.close();		
	}

}
