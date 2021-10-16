import java.util.Scanner;

public class Avg {
    
    public static void main(String[] args) {

        double num1;
        double num2;
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = sc.nextDouble();
        System.out.println("Enter second number");
        num2 = sc.nextDouble();

        if (num1%1 == 0 && num2%1 == 0) {
            System.out.println("One of the number is not double");
        }
        else
        {
            System.out.println("Average : "+(num1+num2)/2);
        }
        
    }

}