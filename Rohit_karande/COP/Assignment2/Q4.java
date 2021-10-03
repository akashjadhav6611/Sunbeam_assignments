//Take integer inputs from user until he/she presses q ( Ask to press q 
//to quit after every integer input ). Print average and product of all 
//numbers.

import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum=0,product=1,i=0;
		int x;
		char quit;
        double average;
		System.out.println("Enter number");
		
		/*//solution 1
		 do {
		String str = sc.next();
		
		if(str.charAt(0)!='q') {
			
			x=Integer.parseInt(str);
			sum=sum+x;
			product+=x;
			i++;	
		}
		else {
			break;
		}
			}while(true); */
		
		// solution 2
		do {
			int num;
			num= sc.nextInt();
			sum=sum+num;
			product+=num;
			i++;
			//System.out.print("Enter number or Press q to quit : ");
			
			quit=sc.next().charAt(0);
			
		}while(quit!='q');
		
			average= sum/i;
		System.out.println("average= "+average);
		System.out.println("product= "+product);
		
		
sc.close();
	}

}
