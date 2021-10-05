//Display sum of the odd numbers and the even numbers from a lower 
//bound to an upper bound.

import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n1,n2;
	    int even=0,odd=0;

    System.out.println("Enter lower bound");
    n1= sc.nextInt();
    System.out.println("Enter upper bound");
    n2= sc.nextInt();
    
      while(n1<n2) { 
   	
     	
     	 
     	 if(n1%2 ==0) {
     		 even+=n1;
     	 }
     	 else { 
     		 odd+=n1;
     	 } 
     	 n1++;
        }
      System.out.println("even sum= "+even);
	    System.out.println("odd sum= "+odd);
    sc.close();
	}

}
