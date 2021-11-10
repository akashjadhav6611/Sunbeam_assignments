package com.tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import static java.util.Comparator.comparing;
import static com.util.CollectionUtils.*;
import java.util.Scanner;
//import static com.app.data.Subject.*;
import java.util.TreeMap;

import com.app.data.Student;
import com.app.data.Subject;

public class StudentTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Student> student1 = populateData();
			Map<String, Student> stud1 = studMap(student1);

			boolean key = false;

			while (!key) {
				try {
					System.out.println("\n1. Display all student details from a list"
							+ "\n2. Display all student details(list) sorted as per GPA :"
							+ "\n3. print sum of  gpa of students for the specified subject"
							+ "\n4. Write a tester to print average of  gpa of students for the specified subject"
							+ "\n5. Print name of specified subject  topper"
							+ "\n6. Print names of  failures for the specified subject chosen  from user."
							+ "\n7. How many distinctions for a specific subject?"
							+ "\n8. Display student details from the map"
							+ "\n9. Display student details from the map , sorted as per student's roll no."
							+ "\n10. Display student details from the map , sorted as per student's dob."
							+ "\n11. Display student details from the map , sorted as per student's roll no. (desc)"
							+ "\n12. EXIT");
					System.out.println("\nEnter choice");

					switch (sc.nextInt()) {

					case 1:
						System.out.println("Student details :");
//						student1.stream().
//						forEach(s -> System.out.println(s));
						// method refrence
						student1.forEach(System.out::println);
						break;

					case 2:
						System.out.println("Sorted Student list as per GPA\n");
						// Comparator<Student> comp1 = (s1,s2) ->
						// ((Double)s1.getGpa()).compareTo(s2.getGpa());
						// Comparator<Student> comp2 = comparing(s -> s.getGpa());
						Comparator<Student> comp3 = comparing(Student::getGpa);
//						student1.sort(comp3);
//						student1.forEach(System.out::println);
						student1.stream().sorted(comp3).forEach(System.out::println);
						break;

					case 3:
						System.out.println("Enter subject");
						String sub = sc.next();
						double sum = student1.stream().filter(s -> s.getSubject() == Subject.valueOf(sub.toUpperCase()))
								.mapToDouble(Student::getGpa).sum();
						System.out.println(sum);
						break;

					case 4:
						System.out.println("Enter subject");
						String sub1 = sc.next();
						double avg = student1.stream()
								.filter(s -> s.getSubject() == Subject.valueOf(sub1.toUpperCase()))
								.mapToDouble(Student::getGpa).average().orElse(0);
						System.out.println(avg);
						break;

					case 5:
						System.out.println("Enter subject");
						String sub2 = sc.next();
						Student s2 = student1.stream()
								.filter(s -> s.getSubject() == Subject.valueOf(sub2.toUpperCase()))
								.max(comparing(Student::getGpa)).get();
						System.out.println(s2.getName() + "  " + s2.getGpa());
						break;

					case 6:
						System.out.println("Enter subject");
						String sub3 = sc.next();
						student1.stream().filter(s -> s.getSubject() == Subject.valueOf(sub3.toUpperCase()))
								.filter(s -> s.getGpa() < 5).forEach(System.out::println);
						break;

					case 7:
						System.out.println("Enter subject");
						String sub4 = sc.next();
						student1.stream().filter(s -> s.getSubject() == Subject.valueOf(sub4.toUpperCase()))
								.filter(s -> s.getGpa() > 7.5)
								.forEach(s -> System.out.println("Name : " + s.getName() + " GPA :" + s.getGpa()));
						break;

					case 8:
						System.out.println("Student details \n");
						stud1.forEach((s, v) -> System.out.println(v));
						break;

					case 9:
						TreeMap<String, Student> studTree = new TreeMap<>(stud1);
						studTree.forEach((s, v) -> System.out.println(v));
						break;

					case 10:
						Collection<Student> studC = stud1.values();
						Comparator<Student> sdob = comparing(Student::getDob);
						studC.stream().sorted(sdob).forEach(System.out::println);
						break;

					case 11:
						Comparator<String> roll = (s1, s8) -> s8.compareTo(s1);
						TreeMap<String, Student> stud2Tree = new TreeMap<>(roll);
						stud2Tree.putAll(stud1);
						stud2Tree.forEach((s, v) -> System.out.println(v));
						break;

					case 12:
						System.out.println("Exit");
						key = true;
						break;

					default:
						System.out.println("\nInvalid Choice\n");
						break;

					}
				} catch (Exception e) {
					System.out.println("Invalid data");
				}
				sc.nextLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}