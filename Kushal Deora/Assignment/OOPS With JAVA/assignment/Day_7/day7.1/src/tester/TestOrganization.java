package tester;
import java.util.Scanner;
import com.app.org.*;
/*
 4.4 Write TestOrganization in "tester" package.
Create suitable array to store organization details.

Provide following options. Run the application till "exit"

1. Hire Manager

2. Hire Worker  

3. Display information of all employees , including net salary using single for-each loop.
Display from the same for-each loop, performance bonus if it's a manager or if it's a worker , display hourly rate of the worker .

4. Update basic salary
i/p : emp id &  increment in basic component of salary
o/p : In case of invalid emp id , give suitable error message. Otherwise , increment the salary.

5.  Exit
 */
public class TestOrganization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of Organisation");
Emp e[]=new Emp[sc.nextInt()];
int counter=0;
int choice;
do {
	System.out.println("1. Hire Manager 2. Hire Worker 3. Display All 4. Update basic salary 0. Exit");
	choice=sc.nextInt();
	switch (choice) {
	case 1:
		if(counter<e.length)
		{
			System.out.println("Enter Manager Details: Name, DeptId, basic, performanceBonus");
			e[counter++]= new Mgr(counter,sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble());
		}
		else
		{
			System.out.println("Full ");
		}
		
		break;
		
	case 2:
		if(counter<e.length)
		{
			System.out.println("Enter Manager Details: Name, DeptId, basic, Hours Worked,Hourly Rate");
			e[counter++]= new Worker(counter,sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		}
		else
		{
			System.out.println("Full ");
		}
		
		break;

	case 3:
		
		for(Emp e1:e)
		{
			if(e1!=null)
			{
				System.out.println("");
			System.out.println(e1);
			System.out.println("Net Salary: "+e1.netSalary());
			
			if(e1 instanceof Mgr)
			{
				System.out.println("Performance Bonus:"+((Mgr)e1).getPerformanceBonus());
				
			}
			else
			{
				System.out.println("Hourly Rate:"+((Worker)e1).getHourlyRate());
			}
			}
		}
		break;
	case 4:
//		4. Update basic salary
//		i/p : emp id &  increment in basic component of salary
//		o/p : In case of invalid emp id , give suitable error message. Otherwise , increment the salary.
		System.out.println("Enter Empid");
		int idx=sc.nextInt()-1;
		if(idx>=0&&idx<counter)
		{
			System.out.println("Enter Increment");
			e[idx].setBasic(sc.nextDouble());
		}
		else
			System.out.println("Invalid Id");
		break;
	}
} while (choice!=0);

System.out.println("Exit Successfull");
sc.close();
	}

}
