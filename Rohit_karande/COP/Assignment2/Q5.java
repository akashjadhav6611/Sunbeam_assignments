//Accept 20 integer inputs from user and print the following:
//number of positive numbers , number of negative numbers
//number of odd numbers , number of even numbers
//number of 0s

import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
  int arr[]= new int[20];
  int i;
  int   positive_count=0;
  int negative_count=0;
  int zero=0;
  int even_count=0;
  int odd_count=0;
	System.out.println("Enter 20 numbers");

  for (i=0; i<20; i++) {
	  arr[i]=sc.nextInt();
  }
  
  
  for(i=0 ;i<20; i++) {
  if(arr[i]>0) {
	  
	  positive_count++;
  }else if (arr[i]<0){
	  
	  negative_count++;
  }else {
  zero++;
  }
  }

  for(i=0 ;i<20; i++) {
	  if(arr[i]%2 == 0) {
		  
		  even_count++;
	  }
	  else {
		  odd_count++;
	  }
  }
  sc.close();
	System.out.println("number of positive nos=" +positive_count);
	System.out.println("number of negative nos=" +negative_count);
	System.out.println("number of zeros nos=" +zero);

	System.out.println("number of even nos=" +even_count);
	System.out.println("number of odd nos=" +odd_count);

   
	}


	}


