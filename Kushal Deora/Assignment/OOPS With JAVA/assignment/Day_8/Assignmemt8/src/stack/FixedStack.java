package stack;

/*
 eg : state :private Employee[] emps;
private int top;

constr : arg-less constr
emps=new Employee[STACK_SIZE]; top=-1;
push : chk if there is any space : YES : emps[++top]=e; , no space : err mesg : Stack Full!!!!
pop : chk required : empty stack : yes : err mesg : ret null
 */
public class FixedStack implements Stack {
	private Employee[] emps;
	private int top;

	public FixedStack() {
		emps = new Employee[Stack.STACK_SIZE];
		top = -1;
	}

	@Override
	public void push(Employee e) {
		// TODO Auto-generated method stub
		if (top==emps.length-1) {
			 
			 System.out.println("Stack Full!!!!");

		} else
			 emps[++top]=e; 
	}

	@Override
	public Employee pop() {
		// TODO Auto-generated method stub
		if(top==-1)
		{
		return null;
		}
		else
		{
			return  emps[top--];
			
		}
	}

}
