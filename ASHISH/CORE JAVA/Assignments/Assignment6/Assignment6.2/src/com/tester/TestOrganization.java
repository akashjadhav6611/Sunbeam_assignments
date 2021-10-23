package com.tester;

import java.util.Scanner;

import com.app.org.*;

public class TestOrganization {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees you want to recruit: ");
		Emp[] e = new Emp[sc.nextInt()];
		
		boolean exit = false;
		int counter = 0;
		
		while(!exit)
		{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("ENTER YOUR CHOICE : ");
			System.out.println("1. Hire Manager");
			System.out.println("2. Hire Worker");
			System.out.println("3. Display information of all employees , including net salary");
			System.out.println("4. Update basic salary");
			System.out.println("5. Exit");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			switch(sc.nextInt())
			{
			case 1:
				if(counter < e.length)
				{
					System.out.println("Enter the information related to Manager for Hiring : Name deptId basicSal performanceBonus");
					e[counter++] = new Mgr(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());
				}
				else
				{
					System.out.println("HIRING FULL!!!!!");
				}
				break;
				
			case 2:
				if(counter < e.length)
				{
					System.out.println("Enter the information related to Worker for Hiring : Name deptId basicSal hoursWorked hourlyRate");
					e[counter++] = new Worker(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
				}
				else
				{
					System.out.println("HIRING FULL!!!!!");
				}
				break;
				
			case 3:
				for(Emp detail : e)
				{
					if(detail != null)
					{
						if(detail instanceof Mgr)
						{
							System.out.println(detail + " , Net Salary = Rs. " + ((Mgr)detail).netSalary() + "]");
						}
						else
						{
							System.out.println(detail + " , Net Salary = Rs. " + ((Worker)detail).netSalary() + "]");
						}
					}
				}
				break;
				
			case 4:
				System.out.println("Enter Employee Id And Salary to increment in Basic Salary :");
				int id = sc.nextInt();
				double sal = sc.nextDouble();
				
				if(id < 1 || id > e.length)
				{
					System.out.println("You have Entered Wrong Id!!!");
				}
				else
				{
					int i = id - 1; //since the value of id starts with 1 for index 0 and continuously incremented by 1 for the next indexes
					if(e[i] != null)
					{
						e[i].setBasicSal(e[i].getBasicSal() + sal);
						System.out.println("Salary updated for Employee Id " + id + ", And the new Basic Salary is " + e[i].getBasicSal());
					}
					else
					{
						System.out.println("There is no any Employee available for this Id!!");
					}
				}
				break;
				
			case 5:
				System.out.println("`````````````````Exit```````````````````");
				exit = true;
				break;
			}
		}
		sc.close();
	}
}
