package com.app.employee;


public class GrowableStack implements Stack 
{
	private int top;
	private Employee[] emp;
	
	public GrowableStack()
	{
		top = -1;
		emp = new Employee[Stack.STACK_SIZE];
	}

	@Override
	public void push(Employee temp) 
	{
		if(top == emp.length -1)
		{
			emp = resizeArray();
			System.out.println("Stack is resized. New size of array : "+emp.length);
		}
		
		emp[++top] = temp;
		
	}
	
	private Employee[] resizeArray()
	{
		Employee[] arr = new Employee[emp.length * 2];
		for(int i = 0 ; i < emp.length ; i++)
		{
			arr[i] = emp[i];
		}
		return arr;
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
