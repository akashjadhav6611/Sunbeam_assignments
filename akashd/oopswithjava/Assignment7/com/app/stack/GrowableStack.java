package com.app.stack;

import com.app.employee.Employee;

public class GrowableStack implements Stack {
	
	private Employee[] emps;
	private static int TOP;
	
	public GrowableStack() {
		emps = new Employee[STACK_SIZE];
		TOP = -1;
	}


	@Override
	public void push(Employee e) {
		// check if there is space
		// then push
		// if no space:
		// double the size of stack
		// create new array, use System.arrayCopy or for loop, (do not use foreach)
		// reassign the reference
		if((TOP+1) < emps.length) {
			emps[++TOP] = e;
		} else {
			// System.out.println("Stack Overflow!");
			emps = extendArray();
			emps[++TOP] = e;
		}
	}
	
	Employee[] extendArray() {
		Employee[] emps_temp = new Employee[(TOP+1) * 2];
		System.arraycopy(emps, 0, emps_temp, 0, TOP+1);
		return emps_temp;
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
