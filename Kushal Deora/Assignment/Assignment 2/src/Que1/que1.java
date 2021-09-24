package Que1;

import java.util.Scanner;

public class que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter the lower bound");
int lb= sc.nextInt();
System.out.println("Enter the upper bound");
int ub= sc.nextInt();
int sum=0;
while(lb<=ub)
{
	sum=sum+lb;
	lb++;
	
	
}

System.out.println("Sum: "+sum);
	}

}
