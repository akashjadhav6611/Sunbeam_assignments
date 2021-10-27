package com.employee_info;

import java.util.Arrays;

public class GrowableStack implements Stacks_P {
	private int top;
	private Employee[] emp;
	
	public GrowableStack() {
		top = -1;
		emp = new Employee[Stacks_P.STACK_SIZE];
	}

	@Override
	public void push(Employee e) {
		// TODO Auto-generated method stub
		if(top==emp.length -1) {
			emp = resizeArray();
			System.out.println("New Array Size : "+emp.length);
		}
		else {
			emp[++top] = e;
		}
		
	}

	

	private Employee[] resizeArray() {
		// TODO Auto-generated method stub
		Employee[] arr = new Employee[Stacks_P.STACK_SIZE*2];
		for(int i = 0;i<emp.length ;i++) {
			arr[i]=emp[i];
		}
		return arr;
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if(top == -1) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println("deleted details : "+emp[top]);
		}
		
		
	}
	@Override
	public void display() 
	{
		for(Employee e : emp)
			if(e != null)
			System.out.println(e);

	}
	

}
