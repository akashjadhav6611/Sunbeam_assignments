//PROGRAM 5: 
package sunbeam;

import java.util.Scanner;

public class Assignment1_P5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Enter First Number :");
		int n1=sc.nextInt();
		System.out.println("Enter Second Number :");
	      int n2=sc.nextInt();
		do
		{
			System.out.println("Enter Choice: 0.Exit 1. Add 2. Sub 3.Mul 4. Div 5. Mod ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Addition = "+(n1+n2));
			break;
			case 2:
				System.out.println("Sub = "+(n1-n2));
			break;
			case 3:
				System.out.println("Mul = "+(n1*n2));
			break;
			case 4:
				System.out.println("Div = "+(n1/n2));
			break;
			case 5:
				System.out.println("Mod = "+(n1%n2));
			break;
			}
		}while(ch!=0);
		sc.close();
	}
		

	}

