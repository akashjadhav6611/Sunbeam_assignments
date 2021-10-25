package com.app.stack;

import com.app.employee.Employee;

public interface Stack {
	int STACK_SIZE = 2;
	
	void push(Employee e);
	Employee pop();
	
	public void printAll();
}
