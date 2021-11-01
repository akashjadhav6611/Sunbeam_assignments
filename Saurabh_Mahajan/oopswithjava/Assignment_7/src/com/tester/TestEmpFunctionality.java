package com.tester;

import java.util.Scanner;
import com.app.employee.*;

public class TestEmpFunctionality {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Stack stack=null;
		
		boolean key = false;
		do
		{
			System.out.println("\n1. Choose fixed stack");
			System.out.println("2. Choose growable stack");
			System.out.println("3. Push data");
			System.out.println("4. Pop data");
			System.out.println("5. Display all employee details");
			System.out.println("\n6. Exit");
			switch(scan.nextInt())
			{
				case 1:
					if(stack == null)
					{
						stack = new FixedStack();
					}else
						System.out.println("Cannot change the stack choice !!!");
					break;
					
				case 2:
					if(stack == null)
					{
						stack = new GrowableStack();
					}else
						System.out.println("Cannot change the stack choice !!!");
					break;
					
				case 3:
					if(stack != null)
					{
						if(stack instanceof FixedStack)
							if(((FixedStack)stack).isStackFull())
							{
								System.out.println("Stack is full !!!");
								break;
							}
						System.out.println("Enter employee details : Name Salary");
						stack.push(new Employee(scan.next(), scan.nextDouble()));
					
					}else
						System.out.println("NO stack choosen !!!");
					break;
					
				case 4:
					if(stack != null)
					{
						stack.pop();
					}else
						System.out.println("NO stack choosen !!!");
					break;
					
				case 5:
					stack.display();
					break;
					
				case 6:
					System.out.println("Exited the program !!!");
					key = true;
					break;
					
				default:
					System.out.println("Invalid choice !!!");
					break;
				}
			
		}while(!key);
		
		
		
		
		scan.close();

	}


}
