import java.util.Scanner;

public class FoodMenu { 
    public static void main(String[] args) {

        boolean exit = false;
        double totalBill = 0.0;
        Scanner sc = new Scanner(System.in);

        while(!exit)
        {
            System.out.println("\nChoose one food item from the following options:\n1. Dosa\n2. Samosa\n3. Idli\n4. Sambhar Bada\n5. Bhajiya\n6. Kachauri\n7. Poha\n8. Lassi\n9. Chai\n10. Generate Bill\n");

            switch(sc.nextInt())
            {
                case 1:
                System.out.print("Enter Quantity: ");
                totalBill += (20*sc.nextInt());
                break;

                case 2:
                System.out.print("Enter Quantity: ");
                totalBill += (5*sc.nextInt());
                break;

                case 3:
                System.out.print("Enter Quantity: ");
                totalBill += (10*sc.nextInt());
                break;

                case 4:
                System.out.print("Enter Quantity: ");
                totalBill += (10*sc.nextInt());
                break;

                case 5:
                System.out.print("Enter Quantity: ");
                totalBill += (10*sc.nextInt());
                break;

                case 6:
                System.out.print("Enter Quantity: ");
                totalBill += (20*sc.nextInt());
                break;

                case 7:
                System.out.print("Enter Quantity: ");
                totalBill += (10*sc.nextInt());
                break;

                case 8:
                System.out.print("Enter Quantity: ");
                totalBill += (25*sc.nextInt());
                break;

                case 9:
                System.out.print("Enter Quantity: ");
                totalBill += (5*sc.nextInt());
                break;

                case 10:
                System.out.println("Total Bill = " + totalBill + "/-");
                exit = true;
                break;
            }
        }
        sc.close();
    }
}
