package Que1;

import java.util.Scanner;

public class que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the Digit Btw 0 to 1000");
		int num = sobj.nextInt();
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		System.out.println(sum);


			}
	}


