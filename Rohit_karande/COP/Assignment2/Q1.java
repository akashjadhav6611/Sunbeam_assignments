//Program to display addition of numbers from a lower bound to an 
 //upper bound using a while-loop.

import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n1,n2;
		int add=0;
    System.out.println("Enter lower bound");
    n1= sc.nextInt();
    System.out.println("Enter upper bound");
    n2= sc.nextInt();
    
 while(n1<n2) { 
	 
	 add+=n1;
	 n1++;
	
    }
    
    System.out.println("addition= "+add);

    sc.close();

	}

}
