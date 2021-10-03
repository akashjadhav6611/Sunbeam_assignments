package Asm;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch,n1,n2;
		System.out.println("Enter n1 and n2");
		n1=sc.nextInt();
		n2=sc.nextInt();

	
		
        
        do {
        	System.out.println("Enter choice:1 for add,2 for sub,3for mul,4for div,0 for exit");
            ch=sc.nextInt();//1
        	switch (ch) {
        	case 1:
        		System.out.println("add= "+(n1+n2));
        		break;
        	case 2:
        		System.out.println("sub= "+(n1-n2));
        		break;
        	case 3:
        		System.out.println("mult= "+(n1*n2));
        		break;
        	case 4:
        		System.out.println("div= "+(n1/n2));
        		break;
        	
        	}
        	
           }while(ch!=0);//1
         sc.close();
	}

}
