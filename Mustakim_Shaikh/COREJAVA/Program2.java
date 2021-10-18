package Assignment1;
import java.util.*;

public class Program2 {

	public static void main(String[] args) {
		
   double Tea = 10.34; double Coffee = 20.34 ; double Dosa = 45.87; double Samosa = 20.34; double Idali = 20.23;
   double Biryani = 150.35; double Paneer = 100.34 ; double drink = 25.00; double IceCream = 90.34; 
		
   System.out.println("\n1. Tea \n2. Coffee \n3. Dosa \n4. Samosa \n5. Idali \n6. Biryani \n7. Paneer \n8. drink \n9. IceCream \n");
   Scanner sm = new Scanner(System.in);
   System.out.println("Enter the quantity: ");
   int q = sm.nextInt();
   double sum = 0.0;
   int ch;
  
   
   do {
	   
	   System.out.println("Enter your choice menu: ");
	   ch = sm.nextInt();
	   
	   switch(ch) {
	   
	   case 1:
		   
		   System.out.println("Tea...");
           sum = (q * Tea) + sum;
           System.out.println("Total price for: " +q+ " Tea is: " +sum);
           break;
       
	   case 2:
		   
		   System.out.println("Coffee...");
           sum = (q * Coffee) + sum;
           System.out.println("Total price for: " +q+ " Coffee is: " +sum);
           break;
           
       case 3:
		   
		   System.out.println("Dosa...");
           sum = (q * Dosa) + sum;
           System.out.println("Total price for: " +q+ " Tea is: " +sum);
           break;
    
       case 4:
		   
		   System.out.println("Samosa...");
           sum = (q * Samosa) + sum;
           System.out.println("Total price for: " +q+ " Samosa is: " +sum);
           break;     

       case 5:
		   
		   System.out.println("Idali...");
           sum = (q * Idali) + sum;
           System.out.println("Total price for: " +q+ " Idali is: " +sum);
           break;       
 
       case 6:
		   
		   System.out.println("Biryani...");
           sum = (q * Biryani) + sum;
           System.out.println("Total price for: " +q+ " Biryani is: " +sum);
           break;  
           
      case 7:
		   
		   System.out.println("Paneer...");
           sum = (q * Paneer) + sum;
           System.out.println("Total price for: " +q+ " Paneer is: " +sum);
           break;   
      
      case 8:
		   
		   System.out.println("drink...");
          sum = (q * drink) + sum;
          System.out.println("Total price for: " +q+ " drink is: " +sum);
          break;      
       
      case 9:
		   
		   System.out.println("IceCream...");
         sum = (q * IceCream) + sum;
         System.out.println("Total price for: " +q+ " IceCream is: " +sum);
         break;      
           
       default:
    	   if(ch!= 0 && ch >= 10)
          System.out.println("Not Available!!!");
          
           break;
	   
	   }
	   
	   
	 System.out.println("Press 0 To get bill...");
	   
   }while(ch != 0);
   
   
   System.out.println("Your total bill is: "+sum);
   
		
	}
	
}
