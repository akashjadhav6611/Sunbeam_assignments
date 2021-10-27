package com.tester;
import java.util.Scanner;
import com.employee_info.*;


public class TestEmp {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		Stacks_P stack = null;
		
		boolean key = false;
		do {
			System.out.println("\n1.choose fixed stack");
			System.out.println("2. choose growable stack");
			System.out.println("3. push data");
			System.out.println("4. pop data");
			System.out.println("5. Display all employee details");
			System.out.println("\n6.EXIT");
			
			switch(sc.nextInt()){
				
			case 1: if(stack == null) {
					stack = new FixedStacks();
			}
			else {
				System.out.println("invalid choice");
			}
				break;
			
			case 2: if(stack == null)
			{
				stack = new GrowableStack();
			}else {
				System.out.println("Cannot change the stack choice !!!");
			}	
			break;
			
			case 3: if(stack!=null) {
				System.out.println("Enter employee details : Name salary");
				stack.push(new Employee(sc.next(),sc.nextDouble()));
			}
			else {
				System.out.println("No stack chosen");
			}
			break;
			
			case 4: if(stack!=null) {
					stack.pop();
					
			}
			else {
				System.out.println("No stack chosen");
			}
			
			break;
			
			case 5:
					stack.display();
					break;
					
			case 6: System.out.println("Exit");
			key = true;
			break;
			
			default: System.out.println("Invalid choice");
			break;
			}
			
		}while(!key);
		
		sc.close();
	}

}
