package stack;
/*
 1.2 Stack interface -- push & pop functionality for Emp refs. & declare STACK_SIZE as a constant. 
eg :
int STACK_SIZE=4;
void  push(Employee e);
Employee pop();
 */
public interface Stack {
	int STACK_SIZE=4;
	public void  push(Employee e);
	public Employee pop();
}
