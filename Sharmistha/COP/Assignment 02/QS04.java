package Assignment02;

import java.util.Scanner;

public class QS04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
	  
	    int i=0;
	    char ch = 'a';
int count=0, product=1;
while(ch != 'q') {
	System.out.println("Enter  Number or enter q: ");
	String s = scan.next();
	if (s.charAt(0) == 'q') {
		ch = 'q';
	}
    	else
    	{
    		int x= Integer.parseInt(s);
    		count=count+ x;
    		product= product*x;
    		i++;
    	}
    	
    	}
	System.out.println("i is :" +i);
	    double avg = (double)count/(double)i;
	    System.out.println("Digit sum is :" +count);
	    System.out.println("Digit sum is :" +avg);
	    System.out.println("Digit sum is :" +product);
	    
	}

}
