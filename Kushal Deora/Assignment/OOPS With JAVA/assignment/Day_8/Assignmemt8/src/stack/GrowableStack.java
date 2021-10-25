package stack;

/*
1.4 Create another implementation class of Stack i/f-- GrowableStack (array based)
eg : public class GrowableStack  imple. Stack 
{
state : same as FixedStack
constr : no change
pop : no change
push : chk if there is any space : same as earlier , no space : double the size of the stack
create new array --copy (System.arrayCopy or for loop)--?????
 */
public class GrowableStack implements Stack {
	private Employee[] emps;
	private int top;

	public GrowableStack() {
		emps = new Employee[Stack.STACK_SIZE];
		top = -1;
	}

	@Override
	public void push(Employee e) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (top==emps.length-1) {
			 
			 //System.out.println("Stack Full!!!!");
			 	emps = resizeArray();
					System.out.println("Stack is resized. New size of array : "+emps.length);
		}
			 emps[++top]=e;
			 } 
	
	
	private Employee[] resizeArray()
	{
		Employee[] arr = new Employee[Stack.STACK_SIZE * 2];
		for(int i = 0 ; i < emps.length ; i++)
		{
			arr[i] = emps[i];
		}
		return arr;
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
		//	emps[top--] = null;
			
		}
	}

}
