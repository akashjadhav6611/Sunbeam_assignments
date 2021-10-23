package com.tester;

import java.util.Scanner;
import com.app.org.*;

public class TestOrganization 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no. of employees : ");
		Emp[] emp = new Emp[scan.nextInt()];
		
		boolean key = false;
		int counter = 0;
		
		while(!key)
		{
			System.out.println("\n1. Hire Manager");
			System.out.println("2. Hire Worker");
			System.out.println("3. Information of all employees");
			System.out.println("4. Update basic salary");
			System.out.println("5. Exit");
			System.out.println("Enter choice : ");
			switch (scan.nextInt()) {
			case 1:
				if(counter < emp.length)
				{
					System.out.println("Enter manager details : name, deptId, basic salary , performanceBonus");
					emp[counter++] = new Mgr(scan.next(), scan.next(), scan.nextDouble(), scan.nextDouble());
				}else
					System.out.println("No vacancies available !!!");
				break;
			
			case 2:
				if(counter < emp.length)
				{
					System.out.println("Enter manager details : name, deptId, basic salary , hoursWorked, hourlyRate");
					emp[counter++] = new Worker(scan.next(), scan.next(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
				}else
					System.out.println("No vacancies available !!!");
				break;
			
			case 3:
				for(Emp e : emp)
				{
					if(e != null)
					{
						System.out.println(e.toString());
						System.out.println("Net Salary : "+e.netSalary());
						if(e instanceof Mgr)
						{
							//System.out.println("Net Salary : "+((Mgr)e).netSalary());
							System.out.println("Performance Bonus : "+((Mgr)e).getPerformanceBonus());
						}
						else if(e instanceof Worker)
						{
							//System.out.println("Net Salary : "+((Worker)e).netSalary());
							System.out.println("Hourly Rate : "+((Worker)e).getHourlyRate());
						}
						else 
						{
							System.out.println("Invalid employee !!!");
						}
					}
				}
				break;
				
			case 4:
				System.out.println("Enter employee id : ");
				int index = scan.nextInt();
				if(index > 0 && index <= emp.length)
				{
					System.out.println("Enter the salary to be incremented : ");
					emp[index-1].setBasic(emp[index-1].getBasic() + scan.nextDouble());
				}
				else
				{
					System.out.println("Invalid employee id!!!");
				}
				break;
				
			case 5:
				System.out.println("Exited the program !!!");
				key = true;
				break;

			default:
				System.out.println("Invalid choice !!!");
				break;
			}
		}
		
		scan.close();
	}


}
