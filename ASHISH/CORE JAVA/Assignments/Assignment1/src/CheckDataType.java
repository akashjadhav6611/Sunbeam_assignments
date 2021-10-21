import java.util.Scanner;

public class CheckDataType {

    public static void main(String[] args) {
        
        System.out.println("Enter two values:\n");
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextDouble())
        {
            double d1 = sc.nextDouble();
            if(sc.hasNextDouble())
            {
                double d2 = sc.nextDouble();
                System.out.println("Value1 = " + d1 + "\nValue2 = " + d2 + "\nAverage = "+ (d1 + d2)/2);
            }
            else
            {
                System.out.println("Second value is not double.");
            }
        }
        else
        {
            System.out.println("First value is not double.");
        }

        sc.close();
    }
}