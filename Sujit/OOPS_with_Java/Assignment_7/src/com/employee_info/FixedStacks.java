package com.employee_info;

public class FixedStacks implements Stacks_P {
	
			private int top;
			private Employee[] emp;
			
			public FixedStacks() {
				
				top = -1;
				emp = new Employee[Stacks_P.STACK_SIZE];
			}
			@Override
			
			public void push(Employee e) {
				
				if(top == emp.length-1) {
					System.out.println("Stack is full");
				}
				else {
					emp[++top] = e;
				}
			}
			

			@Override
			public void pop() {
				// TODO Auto-generated method stub
				if(top == -1) {
					System.out.println("Stack Empty");
				}
				else {
					System.out.println("deleted details : "+emp[top]);
					emp[top--] =null;
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


