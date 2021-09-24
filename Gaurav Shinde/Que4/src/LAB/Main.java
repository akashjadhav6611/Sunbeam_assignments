//Program to calculate the sum of first and the second last digit of a 5-digit number.
package LAB;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    System.out.println("Enter 5-digit number: ");
	Scanner arr = new Scanner(System.in);
	int num = arr.nextInt();
	int a= num /10000;
	int b= (num%100)/10;
	int sum = a+b;
	System.out.println("Sum of 1st and 4th digit is: "+ sum);

        }
    }

