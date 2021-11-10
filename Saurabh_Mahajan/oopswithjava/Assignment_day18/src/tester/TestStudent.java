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

import custom_exception.StudentHandlingException;

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
				try
				{
					System.out.println("\n1.Display by list 2.Sort by gpa 3.Sum of gpa by specific subject "
							+ "\n4.Average of gpa by specific subject 5.Find topper of subject \n6.Find failed students "
							+ "7.Find no of students with distinction \n8.Display by map 9.Sort by roll no(map) "
							+ "10.Sort by dob with map \n11.Sort by rollNo desc");
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
//						studentList.sort(gpaComp);
//						System.out.println("List sorted by gpa : ");
//						studentList.forEach(System.out::println);
						studentList.stream().//converting list to stream
						sorted(gpaComp).//sorting by provided comparator i.e. by gpa
						forEach(System.out::println);//printing sorted stream
						break;
						
					case 3:
						System.out.println("Enter subject name : ");
						Subject sub3 = Subject.valueOf(scan.next().toUpperCase());//string to enum
						double sum =studentList.stream().//converting list to stream
									filter(s -> s.getSubject() == sub3).//intermediate operation - filtering by subject
									mapToDouble(Student :: getGpa).//intermediate - getting(mapping) gpa's of filtered subjects
									sum();//addition - higher order function
						
						System.out.println("Sum : "+sum);
						break;
						
					case 4:
						System.out.println("Enter subject name : ");
						Subject sub4 = Subject.valueOf(scan.next().toUpperCase());//string to enum
						double avg =studentList.stream().//converting list to stream
									filter(s -> s.getSubject() == sub4).//intermediate operation - filtering by subject
									mapToDouble(Student :: getGpa).//intermediate - getting(mapping) gpa's of filtered subjects
									average().//average - higher order function
									//if no student choosen this subject
									orElseThrow(() -> new StudentHandlingException(sub4+" : No student has choosen this subject !!!"));
						
						System.out.println("Average : "+avg);
						break;
						
					case 5:
						System.out.println("Enter subject name : ");
						Subject sub5 = Subject.valueOf(scan.next().toUpperCase());//string to enum
						Student max = studentList.stream().//converting list to stream
									filter(s -> s.getSubject() == sub5).//intermediate operation - filtering by subject
									max(comparing(Student :: getGpa)).//finding max gpa
									//if no student choosen this subject
									orElseThrow(() -> new StudentHandlingException(sub5+" : No student has choosen this subject !!!"));
						
						System.out.println("Name : "+max.getName());
						break;
						
					case 6:
						System.out.println("Enter subject name : ");
						Subject sub6 = Subject.valueOf(scan.next().toUpperCase());//string to enum
						
						System.out.println("Failed student names : ");
						studentList.stream().//converting list to stream
						filter(s -> s.getSubject() == sub6).//intermediate operation - filtering by subject
						filter(s -> s.getGpa() < 5).//intermediate - getting(mapping) gpa's less tha 5 of filtered subjects
						forEach(s -> System.out.println(s.getName()));//printing - higher order function
						//can be done with map(function) before forEach
						break;
						
					case 7:
						System.out.println("Enter subject name : ");
						Subject sub7 = Subject.valueOf(scan.next().toUpperCase());//string to enum
						
						System.out.println("Student names with distinction : ");
						long count = studentList.stream().//converting list to stream
									filter(s -> s.getSubject() == sub7).//intermediate operation - filtering by subject
									filter(s -> s.getGpa() > 7.5).//intermediate - getting(mapping) gpa's greater than 7.5 of filtered subjects
									count();//returns long value
						
						//printing number of students stored in count
						System.out.println("No of students with distinction in "+sub7+" : "+count);
						break;
						
					case 8:
						//higher order function
						studentMap.forEach((s,v) -> System.out.println(v));
						break;
						
					case 9:
						//this constructor of treemap automatically sorts by key i.e. String rollNo
						TreeMap<String, Student> studentTreeMap9 = new TreeMap<>(studentMap);
						//printing sorted map values
						studentTreeMap9.forEach((s,v) -> System.out.println(v));
						break;
						
					case 10:
						//converting map to collection by values() method
						Collection<Student> studentCollection = studentMap.values();
						//creating a custom sorting comparator
						Comparator<Student> dobComp = comparing(Student :: getDob);
						
						studentCollection.stream().//Collection to stream
						sorted(dobComp).//sorting by custom comparator
						forEach(System.out::println);//termination function
						break;
						
					case 11:
						//sorting by key descending
						Comparator<String> rollComp = (s1,s2) -> s2.compareTo(s1);
						//cannot use comparator on TreeMap on V, only possible on K
						//using comparator constructor of TreeMap
						TreeMap<String, Student> studentTreeMap12 = new TreeMap<>(rollComp);
						//adding all K and V of Map to TreeMap
						studentTreeMap12.putAll(studentMap);
						//printing all V of TreeMap
						studentTreeMap12.forEach((s,v) -> System.out.println(v));
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
				catch(Exception e)
				{
					System.out.println(e);
				}
				scan.nextLine();
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
