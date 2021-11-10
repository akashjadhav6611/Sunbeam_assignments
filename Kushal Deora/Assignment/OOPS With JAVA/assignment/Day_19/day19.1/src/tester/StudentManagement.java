package tester;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

import static utils.CollectionUtils.*;
public class StudentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner sc =new Scanner(System.in))
		{
			Map<String, Student> students=restoreStudentDetails("Students.bin");
			boolean exit=false;
			while(!exit)
			{
				System.out.println("1. Display All 2. Admit New Student 3. Cancel Admission 0. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						students.forEach((k,v)->System.out.println(v));
						break;
					case 2:
						System.out.println("Enter roll No");
						String rollno=sc.next();
						if(students.containsKey(rollno))
						{
							System.out.println("Student Exists");
						}
						else
						{
							System.out.println("Enter name,dob,subject,gpa");
							students.put(rollno, new Student(rollno, sc.next(), LocalDate.parse(sc.next()), Subject.valueOf(sc.next().toUpperCase()), sc.nextDouble()));
							System.out.println("Added");
						}
						break;
					case 3:
						System.out.println("Enter roll No");
						 rollno=sc.next();
						Student s= students.remove(rollno);
						if(s==null)
							System.out.println("Not Exists");
						else
						 System.out.println("Removed");
						break;
						
					case 0:
						storeStudentDetails(students,"Students.bin");
						exit=true;
					break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
