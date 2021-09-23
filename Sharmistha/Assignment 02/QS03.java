package Assignment02;

import java.util.Scanner;

public class QS03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Marks: ");
	    int m = scan.nextInt();
	    if(m>80)
	    {
	    	System.out.println("Grade is A");
	    	
	    }
	    else if(m>=60 && m<=80)
	    {
	    	System.out.println("Grade is B");
	    	
	    }
	    else if(m>=50 && m<60)
	    {
	    	System.out.println("Grade is C");
	    	
	    }
	    else if(m>=45 && m<50)
	    {
	    	System.out.println("Grade is D");
	    	
	    }
	    else if(m>=25 && m<45)
	    {
	    	System.out.println("Grade is E");
	    	
	    }
	    
	    else if(m<25)
	    {
	    	System.out.println("Grade is B");
	    	
	    }
	}

}
