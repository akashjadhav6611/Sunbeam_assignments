// Program to perform arithmetic operations, by accepting numbers from user.

package LAB;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter two numbers: ");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        int x = a.nextInt();
        int y = b.nextInt();

        System.out.println("What math would you like to do?");
        int ch;
        do {
            System.out.println("1.ADD" + " 2.SUB" + " 3.DIV" + " 4.MUL" + " 5.MOD" + " 6.EXIT");
            ch = c.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Addition= " + (x + y));
                    break;
                case 2:
                    System.out.println("Subtraction= " + (x - y));
                    break;
                case 3:
                    System.out.println("Division= " + (float) (x / y));
                    break;
                case 4:
                    System.out.println("Multiplication= " + (x * y));
                    break;
                case 5:
                    System.out.println("Modulus= " + (x % y));
                    break;
                }
        } while (ch != 6);

    }
}

