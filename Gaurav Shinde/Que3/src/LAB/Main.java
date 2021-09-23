//Program which prints "ONE", "TWO",..."NINE", "OTHER" using
//a)"nested-if"
//b)"switch-case-default"
package LAB;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Enter an integer from 0 to 9: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        if(n==1)
//            System.out.println("ONE");
//            else
//                if (n==2)
//                    System.out.println("TWO");
//                else
//                    if (n==3)
//                    System.out.println("THREE");
//                else
//                    if (n==4)
//                    System.out.println("FOUR");
//                else
//                    if (n==5)
//                    System.out.println("FIVE");
//                else
//                    if (n==6)
//                    System.out.println("SIX");
//                else
//                    if (n==7)
//                    System.out.println("SEVEN");
//                else
//                    if (n==8)
//                    System.out.println("EIGHT");
//                else
//                    if (n==9)
//                    System.out.println("NINE");
//                else
//                    System.out.println("OTHER");

        switch (n){
            case 1: System.out.println("ONE");
            break;
            case 2: System.out.println("TWO");
            break;
            case 3: System.out.println("THREE");
            break;
            case 4: System.out.println("FOUR");
            break;
            case 5: System.out.println("FIVE");
            break;
            case 6: System.out.println("SIX");
            break;
            case 7: System.out.println("SEVEN");
            break;
            case 8: System.out.println("EIGHT");
            break;
            case 9: System.out.println("NINE");
            break;
            default: System.out.println("OTHER");
        }
        }
    }

