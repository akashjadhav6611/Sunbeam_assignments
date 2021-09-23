//Shopkeeper offers 10% discount if bill exceeds 1000/-. Get the quantity of goods from the user and print total
//bill of customer assuming each good is for 100/-.

package LAB;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       System.out.println("Enter number of goods purchased: ");
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int a = 100*n,c=0;
       if(n>10)
           c = (90 * (100 * n)) / 100;

       else
           a = 100*n;
       System.out.println("Total Price: "+a+"  Discounted Price: "+c);
        }
    }

