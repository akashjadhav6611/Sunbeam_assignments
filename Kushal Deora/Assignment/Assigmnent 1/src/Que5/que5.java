package Que5;

import java.util.Scanner;

public class que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number");
int num1=sc.nextInt();
System.out.println("Enter Second Number");
int num2=sc.nextInt();
System.out.println("Enter the Operation ");

System.out.println("1. Add 2. Sub 3. Multiply 4. Division");
int op=sc.nextInt();

switch(op)
{
case 1:System.out.println("Addition is : "+(num1+num2));
	break;
case 2:System.out.println("Substraction is : "+(num1-num2));
break;
case 3:System.out.println("Multiplication is : "+(num1*num2));
break;
case 4:System.out.println("Division is : "+(num1/num2));
break;
default:System.out.println("Invalid Operation");
break;
}
	}

}
