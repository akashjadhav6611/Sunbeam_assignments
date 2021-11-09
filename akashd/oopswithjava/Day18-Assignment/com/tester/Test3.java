package com.tester;

import java.util.ArrayList;

import com.core.app.Student;
import com.utils.CollectionUtils;
import static com.enums.Subject.*;
/*
3. Write a tester to print sum of gpa of students for the specified subject
(Hint : filter,map,reduce)
sum (gpa) for specific subject.
convert subject to enum using valueOf
list --> stream --> filter --> mapping (Student --> gpa)(Student::gpa) : mapToDouble --> DoubleStream --> sum()
*/

public class Test3 {

	public static void main(String[] args) {
		ArrayList<Student> list = CollectionUtils.populateStudentList();
		System.out.println("All students");
		list.stream().forEach(System.out::println);
		String specifiedSubject = "Java";
		System.out.println("Sum of " + specifiedSubject + " gpa");
		System.out.println(
			list
				.stream()
				.filter(s -> s.getSubject() == valueOf(specifiedSubject.toUpperCase()))
				.mapToDouble(Student::getGpa)
				.sum()
		);

	}

}
