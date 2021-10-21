package menu_driven;

import java.util.Scanner;

public class Ass1_3_menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of your choice");
		int num = sc.nextInt();
		
		
switch(num) {
	    
	    case 0:System.out.println("Zero");break;
	    case 1:System.out.println("One");break;
	    case 2:System.out.println("Two");break;
	    case 3:System.out.println("Three");break;
	    case 4:System.out.println("Four");break;
	    case 5:System.out.println("Five");break;
	    case 6:System.out.println("Six");break;
	    case 7:System.out.println("Seven");break;
	    case 8:System.out.println("Eight");break;
	    case 9:System.out.println("Nine");break;
	    default:System.out.println("Enter Valid Response");break;
	    
	    }
		
		if(num == 1) {
			System.out.println("one");
		}
		else if(num==2) {
			System.out.println("Two");
		}
		else if(num == 3) {
			System.out.println("three");
		}
		else if(num==4) {
			System.out.println("Four");
		}
		else if(num==5) {
			System.out.println("Five");
		}
		else if(num==6) {
			System.out.println("Six");
		}
		else if(num==7) {
			System.out.println("Seven");
		}
		else if(num==8) {
			System.out.println("Eight");
		}
		else if(num==9) {
			System.out.println("Nine");
		}
		else if(num==0  || num>9) {
			System.out.println("Other");
		}

	}

}
