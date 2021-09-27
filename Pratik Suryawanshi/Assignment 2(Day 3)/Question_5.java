// Accept 20 integer inputs from user and print the following: 
// number of positive numbers , 
// number of negative numbers 
// number of odd numbers , 
// number of even numbers
// number of 0s.

package question_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int counter=0, pCounter=0,nCounter=0,oCounter=0,eCounter=0,num;
		for(int i=1;i<=20;i++) {
				System.out.println("Enter The Number: ");
			num=sc.nextInt();
			if(num==0)//Check if number is Zero 
			{
				
				
				counter++;
			}

			else //If number is not zero
			{
				if(Math.abs(num)%2==0)//Checks if Numeber(both +ve and -ve ) is Even
				{
					eCounter++;
					if(num>0) //Checks if Number is Positive
					{
						pCounter++;
					}
					
					
					else //Checks if Number is Negative
					{
						nCounter++;
					}
				}
				
				
				else //If Number is not Even i.e. Number is ODD
				{
					oCounter++;
					eCounter++;
					if(num>0) //Checks if Number is Positive
					{
						pCounter++;
					}
					else //Checks if Number is Negative
					{
						nCounter++;
					}

				}
			}

		}
		System.out.println("No of Positive Number: "+pCounter);
		System.out.println("No of Negative Number: "+nCounter);
		System.out.println("No of Even Number: "+eCounter);
		System.out.println("No of Odd Number: "+oCounter);

		System.out.println("No of Zeros: "+counter);



	}

}
