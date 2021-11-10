package tester;


import static utils.SerDeSerUtils.*;

import static java.time.LocalDate.parse;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Address;
import com.app.core.Student;
import static com.app.core.Subject.*;

import custom_exception.StudentHandlingException;

public class StudentManagement {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in))
		{
			HashMap<String, Student> studentHashMap = restoreDetails("temp.txt");
			
			boolean key = false;
			
			while(!key)
			{
				try
				{
					System.out.println("\n1.Display all students 2.Admit new student 3.Cancel admission \n0.Exit");
					System.out.println("Enter choice : ");
					
					switch (scan.nextInt()) {
					case 0:
						System.out.println("Exited the program...");
						key = true;
						break;

					case 1:
						studentHashMap.forEach((k,v) -> System.out.println(v));
						break;
						
					case 2:
						System.out.println("Enter two digit roll no : ");
						String rollNo2 = scan.next();
						if(studentHashMap.containsKey(rollNo2))
							throw new StudentHandlingException("Roll number already exists !!!");
							
						//String rollNo, String name, LocalDate dob, Subject subject, double gpa
						System.out.println("Enter student details : name, dob(yyyy-MM-dd), subject, gpa");
						studentHashMap.put(rollNo2, new Student(rollNo2, 
																scan.next(), 
																parse(scan.next()), 
																valueOf(scan.next().toUpperCase()), 
																scan.nextDouble()));
						//demo to add - michael 1955-11-23 angular 9.66
						
						System.out.println("Enter student address : city, state, phone");
						//demo to add - mumbai MH 7506621354
						studentHashMap.get(rollNo2).assignAddress(new Address(scan.next(), scan.next(), scan.next()));
						System.out.println("Student added...");
						
						break;
						
					case 3:
						System.out.println("Enter two digit roll no : ");
						String rollNo3 = scan.next();
						
						if(!studentHashMap.containsKey(rollNo3))
							throw new StudentHandlingException("Roll number does not exists !!");
						
						studentHashMap.remove(rollNo3);
						System.out.println("Admission successfully cancelled !!!");
						break;
						
					default:
						System.out.println("Invalid choice !!!");
						break;
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				scan.nextLine();
			}
			
			storeDetails(studentHashMap, "temp");
			System.out.println("HashMap stored on binary...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
