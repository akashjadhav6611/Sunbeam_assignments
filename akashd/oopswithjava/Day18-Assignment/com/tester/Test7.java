package com.tester;

import java.util.ArrayList;

import com.core.app.Student;
import com.utils.CollectionUtils;
import static com.enums.Subject.*;

public class Test7 {
/*
7. How many distinctions for a specific subject
(gpa > 7.5 : distinction)
filter,count
list > stream -> filter (subject) -> filter (gpa > 7.5) -> [Stream<Student>] count()
*/
	public static void main(String[] args) {
		ArrayList<Student> list = CollectionUtils.populateStudentList();
		String specifiedSubject = "Java";
		
		System.out.println(
				list
					.stream()
					.filter(s -> s.getSubject() == valueOf(specifiedSubject.toUpperCase()))
					.filter(s -> s.getGpa() > 7.5)
					.peek(System.out::println)
					.count()
				);
	}

}
