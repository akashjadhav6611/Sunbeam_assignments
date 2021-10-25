package com.app.employee;

public interface Stack 
{
	int STACK_SIZE = 3;
	
	public void push(Employee temp);
	
	public void pop();
	
	public void display();

}
