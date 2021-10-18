import java.util.Scanner;

public class Menu {

    public static void main (String[] args) {

        int choice,qty;
        int sum = 0,tea=10,coffee=15,poha=20,upma=20,dosa=40;
        String items = "";
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("\n1.Tea - 10 rs\n2.Coffee - 15 rs\n3.Poha - 20 rs\n4.Upma - 20 rs\n5.Dosa - 40 rs\n\n10.Generate Bill");
            System.out.println("Enter Choice : ");
            choice = sc.nextInt();
            System.out.println("Enter quantity : ");
            qty = sc.nextInt();

            switch (choice) {
                case 1:
                    items = items+"\n"+"Tea - "+qty;
                    while(qty!=0){
                        sum = sum + tea;
                        qty--;
                    }
                    break;
                
                    case 2:
                    items = items+"\n"+"Coffee - "+qty;
                    while(qty!=0){
                        sum = sum + coffee;
                        qty--;
                    }
                    break;
                
                    case 3:
                    items = items+"\n"+"Poha - "+qty;
                    while(qty!=0){
                        sum = sum + poha;
                        qty--;
                    }
                    break;
                
                    case 4:
                    items = items+"\n"+"Upma - "+qty;
                    while(qty!=0){
                        sum = sum + upma;
                        qty--;
                    }
                    break;
                
                    case 5:
                    items = items+"\n"+"Dosa - "+qty;
                    while(qty!=0){
                        sum = sum + dosa;
                        qty--;
                    }
                    break;
                
                default:
                System.out.println("Invalid choice !!!");
                    break;
            }
        

        }while(choice != 10);

        System.out.println(items+"\nTotal Bill = "+sum);
    }

}