import java.net.SocketPermission;
import java.util.Scanner;
public class Double {
    public static void main(String[] args){

        double num1;
        double num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number num1 :");

        if(sc.hasNextDouble()){
            num1 = sc.nextDouble();
            System.out.println("Enter second number num2 :");
            if(sc.hasNextDouble()){
                num2 = sc.nextDouble();
                System.out.println("Average : "+(num1+num2)/2);

            }
            else
            {
                System.out.println("Number is not double");
            }
        }
        else
        {
            System.out.println("Number is not double");
        }
    }
}
