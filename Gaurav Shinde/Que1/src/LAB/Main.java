//Write a Java program that reads an integer between 0 and 1000 and adds all
//the digits in that integer.
package LAB;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter an integer between 0 and 1000");
        Scanner i = new Scanner(System.in);
        int num = i.nextInt();
        int a, b, c, sum;
        if(num>0 && num<1000) {
            a = num / 100;
            b = (num % 100) / 10;
            c = num % 10;
            sum = a + b + c;
            System.out.println("Sum of digits: " + sum);
        }
        else
        System.out.println("Error: Number outside 0-1000 ");



            }
        }


