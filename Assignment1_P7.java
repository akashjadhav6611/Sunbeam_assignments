package sunbeam;
import java.util.Scanner;

public class Assignment1_P7 {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		 System.out.println("Enter number of quantity : ");
	       Scanner in = new Scanner(System.in);
	       int quantity = in.nextInt();
	       int x = 100*quantity,y=0;
	       if(quantity>10)
	           y = (90 * (100 * quantity)) / 100;

	       else
	           x = 100*quantity;
	       System.out.println("Total Price: "+x+"  Discounted Price: "+y);
		}
		       
	}

			
	
		

	
