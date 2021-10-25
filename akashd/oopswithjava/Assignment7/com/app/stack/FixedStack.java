package com.app.stack;

import com.app.employee.Employee;

public class FixedStack implements Stack{

	private Employee[] emps;
	private static int TOP;
	
	public FixedStack() {
		emps = new Employee[STACK_SIZE];
		TOP = -1;
	}
	
	@Override
	public void push(Employee e) {
		// chk if there is any space
		// if yes
		// emps[++top] = e
		// no space: stack overflow!
		if((TOP+1) < STACK_SIZE) {
			emps[++TOP] = e;
		} else {
			System.out.println("Stack Overflow!");
		}
	}

	@Override
	public Employee pop() {
		// if empty stack
		// return null
		// else add
		if(TOP >=0 ) {
			Employee returnEmployee =  emps[TOP--];
			System.out.println(returnEmployee);
			return returnEmployee;
		} else {
			return null;
		}
	}
	
	@Override
	public void printAll() {
		for(int i = 0; i <= TOP; i++) {
			if(emps[i] != null)
				System.out.println(emps[i]);
		}
	}

}
