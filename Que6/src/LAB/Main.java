// Program to print absolute value of a number entered by user.
package LAB;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter an integer value: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("INPUT= "+x+" OUTPUT= "+Math.abs(x));
        System.out.println("Enter a float value: ");
        float y = in.nextFloat();
        System.out.println("INPUT= "+y+" OUTPUT= "+Math.abs(y));
    }
}
