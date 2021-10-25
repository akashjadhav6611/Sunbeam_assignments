package com.app.employee;

public class FixedStack implements Stack 
{
	private int top;
	private Employee[] emp;
	
	public FixedStack()
	{
		top = -1;
		emp = new Employee[Stack.STACK_SIZE];
	}

	@Override
	public void push(Employee temp)
	{
		if(top == emp.length -1)
		{
			System.out.println("Stack is full !!!");
		}
		else
		{
			emp[++top] = temp;
		}
	}

	@Override
	public void pop() 
	{
		if(top == -1)
		{
			System.out.println("Stack Empty !!!");
		}
		else
		{
			System.out.println("Employee deleted : "+emp[top]);
			emp[top--] = null;
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
