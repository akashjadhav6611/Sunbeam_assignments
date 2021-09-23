import java.util.Scanner;

public class Qs05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n1,n2, add, mul, sub, ch;
	double div;
Scanner S = new Scanner(System.in);
System.out.println("Enter first number : ");
n1=S.nextInt();
System.out.println("Enter Second number : ");
n2=S.nextInt();
while(true)
{
	 System.out.println("Enter 1 for addition");
     System.out.println("Enter 2 for subtraction");
     System.out.println("Enter 3 for multiplication");
     System.out.println("Enter 4 for division");
     System.out.println("Enter 5 to Exit");
     ch= S.nextInt();

switch(ch)
{
case 1 : 
	add = n1+n2;
	System.out.println ("1. Add " +add);
	break;
case 2:
    sub = n1 - n2;
    System.out.println("Result:"+sub);
    break;

    case 3:
    mul = n1 * n2;
    System.out.println("Result:"+mul);
    break;

    case 4:
    div = (double)n1 / n2;
    System.out.println("Result:"+div);
    break;    

    case 5:
    System.exit(0);
	
}

	}

}
}