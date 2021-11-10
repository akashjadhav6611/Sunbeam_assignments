package com.tester;

import java.util.ArrayList;

import com.core.app.Student;
import com.utils.CollectionUtils;
import static com.enums.Subject.*;

/*
6 Print names of  failures for the specified subject chosen  from user.
(gpa < 5 : failed case)
list -> stream -> filter(subject) -> filter (gpa < 5) [you get stream<student>] -> map or forEach(sop s.getName)
map student to its name [hof]
*/

public class Test6 {

	public static void main(String[] args) {
		ArrayList<Student> list = CollectionUtils.populateStudentList();
		String specifiedSubject = "React";
		double failGpa = 5;
		list
			.stream()
			.filter(s -> s.getSubject() == valueOf(specifiedSubject.toUpperCase()))
			.filter(s -> s.getGpa() < failGpa)
			//.peek(System.out::println)
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println("---------OR--------");
		
		list
			.stream()
			.filter(s -> s.getSubject() == valueOf(specifiedSubject.toUpperCase()))
			.filter(s -> s.getGpa() < failGpa)
			.map(s -> s.getName())
			.forEach(System.out::println);

	}

}
