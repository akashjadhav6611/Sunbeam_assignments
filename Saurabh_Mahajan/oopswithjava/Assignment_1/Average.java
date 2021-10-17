import java.util.Scanner;

public class Average {

    public static void main(String[] args){

        double num1;
        double num2;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter first number : ");
            num1 = sc.nextDouble();
            System.out.println("Enter second number");
            num2 = sc.nextDouble();
            System.out.println("Average : "+(num1+num2)/2);
            
        } catch (Exception e) {
            System.out.println("\n"+e);
            System.out.println("Value entered is not of data type double");
        }
        
    }

}