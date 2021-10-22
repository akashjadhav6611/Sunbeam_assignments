import java.util.*;
class Bill {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice,qty;
        double total=0;
        boolean flag=true;
        do{
        System.out.println("1. Dosa 2. Idli 3. Ice Cream 4. Desert 5. Generate");
       choice = sc.nextInt();
      
       switch (choice) {
             case 1:
             System.out.println("Enter Qty");
             qty=sc.nextInt();
                    total+=(qty*100);
               break;
               case 2:
               System.out.println("Enter Qty");
               qty=sc.nextInt();
               total+=(qty*300);
               break;
               case 3:
               System.out.println("Enter Qty");
               qty=sc.nextInt();
               total+=(qty*20);
               break;
               case 4:
               System.out.println("Enter Qty");
               qty=sc.nextInt();
               total+=(qty*160);
               break;
               case 5:
                System.out.println("Bill:"+total);
                flag=false;
               break;
          
        }
    }while(flag);
    sc.close();
    }
}
