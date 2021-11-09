package com.tester;

import java.util.ArrayList;

import com.core.app.Student;
import com.utils.CollectionUtils;
import static com.enums.Subject.*;
/*
4. Write a tester to print average of  gpa of students for the specified subject
(Hint : filter,map,average,optional)
list --> stream --> filter --> mapping (Student --> gpa)(Student::gpa) : mapToDouble --> DoubleStream --> average()
[Double returns OptionalDouble]. use orElse
 */
public class Test4 {

	public static void main(String[] args) {
		ArrayList<Student> list = CollectionUtils.populateStudentList();
		String specifiedSubject = "Java";
		System.out.println(
			list
				.stream()
				.filter(s -> s.getSubject() == valueOf(specifiedSubject.toUpperCase()))
				.mapToDouble(Student::getGpa)
				.average()
				.orElse(0)
		);

	}

}
