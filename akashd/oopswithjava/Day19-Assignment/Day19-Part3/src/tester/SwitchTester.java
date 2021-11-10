package tester;

import static java.time.LocalDate.parse;
import static utils.SerUtils.storeStudentDetails;
import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import com.app.core.Subject;
import com.app.core.Address;
import com.app.core.Student;

import custom_exceptions.StudentHandlingException;
import utils.DeSerUtils;

public class SwitchTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			Map<String, Student> hm =  DeSerUtils.restoreProducts("testser");
			if(hm == null)
				throw new StudentHandlingException("Couldn't get student details");
			
			boolean exit = false;
			while(!exit) {
				//menu
				try {
					System.out.println("Menu: ");
					System.out.println("1 Display all student details");
					System.out.println("2 Admit New Student");
					System.out.println("3 Cancel Admission");
					System.out.println("4 Exit");
					switch (sc.nextInt()) {
					case 1:
						hm.forEach((rollno, student) -> System.out.println(student));
						break;
					case 2:
						System.out.println("Enter the roll no you want to enter");
						String roll = sc.next();
						if(hm.containsKey(roll))
							throw new StudentHandlingException(roll + " already exists!");
						// roll not found, so we can add key other data
						System.out.println("Enter student details: ");
						System.out.println("name, dob(yyyy-MM-dd), subject, gpa");
						Student tempStudent = new Student(roll, sc.next(), parse(sc.next()), Subject.valueOf(sc.next()), sc.nextDouble());
						System.out.println("Enter the student's address details");
						System.out.println("city, state code, pin code");
						tempStudent.assignAddress(new Address(sc.next(), sc.next(), sc.next()));
						System.out.println("Student details: ");
						System.out.println(tempStudent);
						
						// now we can add student into map
						hm.put(roll, tempStudent);
						System.out.println("Student entry successful");
						break;
					case 3:
						System.out.println("Enter the roll no of the student you want to remove");
						String removeRollNo = sc.next();
						if(!hm.containsKey(removeRollNo))
							throw new StudentHandlingException(removeRollNo + " does not exist in database!");
							
						Student s = hm.remove(removeRollNo);
						if (s != null) {
							System.out.println("Student whose admission is cancelled");
							System.out.println(s);
						}
						else
							System.out.println("Student couldn't be removed"); // this case possibly cannot happen
						
						break;
					case 4:
						storeStudentDetails(hm, "testser");
						System.out.println("Serialization complete");
						exit = true;
						break;
					default:
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine(); // clear buffer
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
