package com.tester;

import java.util.Scanner;

import com.app.employee.Employee;
import com.app.stack.FixedStack;
import com.app.stack.GrowableStack;
import com.app.stack.Stack;

public class AppTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack s = null;
		boolean exit = false;
		
		while(!exit) {
			System.out.println("Menu");
			System.out.println("You can choose stack only once");
			System.out.println("1. Choose fixed stack");
			System.out.println("2. Choose growable stack");
			System.out.println("-----------------------------");
			System.out.println("3. Push data");
			System.out.println("4. Pop data");
			System.out.println("5. Exit");
			System.out.println("6. Print all stack members");
			System.out.println("Enter choice:");
			switch(sc.nextInt()) {
			case 1:
				if(s == null) {
					s = new FixedStack();
				} else {
					System.out.println("Error: Stack already selected!");
				}
				break;
			case 2:
				if(s == null) {
					s = new GrowableStack();
				} else {
					System.out.println("Error: Stack already selected");
				}
				break;
			case 3:
				if(s != null) {
					System.out.println("Enter employee data in following order");
					System.out.println("id name salary");
					s.push(new Employee( sc.nextInt(), sc.next(), sc.nextDouble() ));
	//				s.push(new Employee( 1, "akash", 10 )); // quickpush
				} else {
					System.out.println("Select a stack first! Option 1 or 2");
				}
				
				break;
			case 4:
				if(s != null) {
					Employee poppedEmployee = s.pop();
					if(poppedEmployee != null) {
						poppedEmployee.toString();
					} else {
						System.out.println("Error! Stack empty!");
					}
				} else {
					System.out.println("Select a stack first! Option 1 or 2");
				}
				
				break;
			case 5:
				exit = true;
				break;
			case 6:
				if(s != null) {
					s.printAll();
				} else {
					System.out.println("Select a stack first! Option 1 or 2");
				}
				
				break;
			}
		}
		
		
		sc.close();

	}

}
