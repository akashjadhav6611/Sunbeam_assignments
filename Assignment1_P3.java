package sunbeam;

import java.util.Scanner;

public class Assignment1_P3
{

	public static void main(String[] args)
	{
		int n;
		
			System.out.println("enter the number : ");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
		
	//	if(n==1|| n==2 || n==3||n==4||n==5||n==6||n==7||n==8||n==9)
	//	{
		//if(n==1)
			//System.out.println("ONE");
			//if(n==2)
			//System.out.println("TWO");
		//if(n==3)
			//System.out.println("THREE");
		//if(n==4)
			//System.out.println("FOUR");
		//if(n==5)
			//System.out.println("FIVE");
//		if(n==6)
	//		System.out.println("SIX");
		
		//if(n==7)
			//System.out.println("SEVEN");
//		if(n==8)
	//		System.out.println("EIGHT");
		//if(n==9)
			//System.out.println("NINE");
	//}
		//else
		//	System.out.println("OTHER");
		switch(n)
		{
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("OTHER");
			break;
		}
		sc.close();
	}
}
	

		
