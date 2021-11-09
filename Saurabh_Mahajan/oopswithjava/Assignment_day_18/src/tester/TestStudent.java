package tester;

import static utils.CollectionUtils.*;
import static java.util.Comparator.comparing;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.core.Student;
import com.app.core.Subject;

public class TestStudent 
{

	public static void main(String[] args) 
	{
		List<Student> studentList = sampleData();
		Map<String,Student> studentMap = sampleMapData(studentList);
		
		boolean key = false;
		try(Scanner scan = new Scanner(System.in))
		{
			while(!key)
			{
				System.out.println("\n1.Display by list 2.Sort by gpa 3.Sum of gpa by specific subject "
						+ "\n4.Average of gpa by specific subject 5.Find topper of subject \n6.Find failed students "
						+ "7.Find no of students with distinction \n8.Display by map 9.Sort by roll no(map) "
						+ "10.Sort by dob with map");
				System.out.println("0.Exit");
				System.out.println("Enter choice : ");
				
				switch(scan.nextInt())
				{
				case 1:
					//by lambda
					studentList.stream().
					forEach(s -> System.out.println(s));
					//by method reference
					//studentList.forEach(System.out::println);
					break;
					
				case 2:
					//3 methods to do - all work
					//Comparator<Student> gpaComp2 = (s1,s2) -> ((Double)s1.getGpa()).compareTo(s2.getGpa());
					//Comparator<Student> gpaComp3 = comparing(s -> s.getGpa());
					Comparator<Student> gpaComp = comparing(Student :: getGpa);
					studentList.sort(gpaComp);
					studentList.forEach(System.out::println);
					break;
					
				case 3:
					System.out.println("Enter subject name : ");
					Subject sub3 = Subject.valueOf(scan.next().toUpperCase());
					double sum =studentList.stream().
								filter(s -> s.getSubject() == sub3).
								mapToDouble(Student :: getGpa).
								sum();
					
					System.out.println("Sum : "+sum);
					break;
					
				case 4:
					System.out.println("Enter subject name : ");
					Subject sub4 = Subject.valueOf(scan.next().toUpperCase());
					double avg =studentList.stream().
								filter(s -> s.getSubject() == sub4).
								mapToDouble(Student :: getGpa).
								average().
								orElse(0);//can be tried with orElseThrow(supplier)
					
					System.out.println("Average : "+avg);
					break;
					
				case 5:
					System.out.println("Enter subject name : ");
					Subject sub5 = Subject.valueOf(scan.next().toUpperCase());
					double max = studentList.stream().
								filter(s -> s.getSubject() == sub5).
								mapToDouble(Student :: getGpa).
								max().
								getAsDouble();
					
					studentList.stream().
					filter(s -> s.getGpa() == max).
					forEach(s -> System.out.println("Student name : "+s.getName()));
					break;
					
				case 6:
					System.out.println("Enter subject name : ");
					Subject sub6 = Subject.valueOf(scan.next().toUpperCase());
					
					System.out.println("Failed student names : ");
					studentList.stream().
					filter(s -> s.getSubject() == sub6).
					filter(s -> s.getGpa() < 5).
					forEach(s -> System.out.println(s.getName()));
					//can be done with map(function) before forEach
					break;
					
				case 7:
					System.out.println("Enter subject name : ");
					Subject sub7 = Subject.valueOf(scan.next().toUpperCase());
					
					System.out.println("Student names with distinction : ");
					long count = studentList.stream().
								filter(s -> s.getSubject() == sub7).
								filter(s -> s.getGpa() > 7.5).
								count();
					
					System.out.println("No of students with distinction in "+sub7+" : "+count);
					break;
					
				case 8:
					studentMap.forEach((s,v) -> System.out.println(v));
					break;
					
				case 9:
					TreeMap<String, Student> studentTreeMap = new TreeMap<>(studentMap);
					studentTreeMap.forEach((s,v) -> System.out.println(v));
					break;
					
				case 10:
					Collection<Student> studentCollection = studentMap.values();
					Comparator<Student> dobComp = comparing(Student :: getDob);
					
					studentCollection.stream().
					sorted(dobComp).
					forEach(System.out::println);
					break;
					
				case 0:
					System.out.println("Exited the program...");
					key = true;
					break;
					
				default:
					System.out.println("Invalid choice !!!");
					break;
				}
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
