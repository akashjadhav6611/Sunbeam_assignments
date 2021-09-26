import java.util.Scanner;

public class Asg_6 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = sc.nextInt();

		if(number < 0)
			System.out.println("Absolute value of the number : "+(number*(-1)));
		else
			System.out.println("Absolute value of the number : "+number);
	}

}
