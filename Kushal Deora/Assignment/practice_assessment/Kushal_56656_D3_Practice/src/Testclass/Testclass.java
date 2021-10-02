package Testclass;

import java.util.Scanner;
class Arithmetic
{
	int res;
	int Addition(int num1,int num2)
	{
		res=num1+num2;
				return res;
	}
	int Subtraction(int num1,int num2)
	{
		res=num1-num2;
				return res;
	}
	int Multiplication(int num1,int num2)
	{
		res=num1*num2;
				return res;
	}
	int Division(int num1,int num2)
	{
		res=num1/num2;
				return res;
	}
}

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Arithmetic ar = new Arithmetic();
int choice ;
int num1;
int num2;

do {
System.out.println("Enter the choice");
System.out.println(" 1.Addition  2.Subtraction  3.Multiplication  4.Division  0.Exit");
choice = sc.nextInt();

if((choice>0))
{
	System.out.println("Enter First Number");
	num1=sc.nextInt();
	System.out.println("Enter Second Number");
	num2=sc.nextInt();
 
	switch(choice)
	{
	case 1: //Addition
		System.out.println("Addition is "+ar.Addition(num1, num2));
		break;
		
	case 2: //Subtraction
		System.out.println("Subtraction is "+ar.Subtraction(num1, num2));
		break;
		
	case 3: //Multiplication
		System.out.println("Multiplication is "+ar.Multiplication(num1, num2));
		break;
		
	case 4: //Division
		if(num2>0)
			System.out.println("Division is "+ar.Division(num1, num2));
		else
			System.out.println("Denominator cannot be zero");
		break;
		
		default:
			System.out.println("Invalid Choice");
			break;

	}
}


}while(choice!=0);

sc.close();
	}
	  
}
