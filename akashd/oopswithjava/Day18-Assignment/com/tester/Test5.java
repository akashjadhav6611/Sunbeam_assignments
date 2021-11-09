package com.tester;

import java.util.ArrayList;

import com.core.app.Student;
import com.utils.CollectionUtils;

import custom_exceptions.StudentHandlingException;

import static com.enums.Subject.*;
import static java.util.Comparator.*;

/*
5 Print name of specified subject  topper
(filter , max,optional)
take imput subject from user
list -> stream -> filter -> max() [avaible in stream] -> max returns optional<t>. use orElse. [Use orElseThrow optional] 
*/

public class Test5 {

	public static void main(String[] args) {
		ArrayList<Student> list = CollectionUtils.populateStudentList();
		String specifiedSubject = "Java";
		String specifiedSubject1 = "Javax";
		try {
			System.out.println(list.stream()
					.filter(s -> s.getSubject() == valueOf(specifiedSubject.toUpperCase()))
					.max(comparing(Student::getGpa))
					.orElseThrow(() -> new StudentHandlingException(specifiedSubject + " has no students!")));
			
			System.out.println(list.stream()
					.filter(s -> s.getSubject() == valueOf(specifiedSubject.toUpperCase()))
					.max(comparing(Student::getGpa))
					.get()
					.getName());
			
			System.out.println(list.stream()
					.filter(s -> s.getSubject() == valueOf(specifiedSubject1.toUpperCase()))
					.max(comparing(Student::getGpa))
					.orElseThrow(() -> new StudentHandlingException(specifiedSubject1 + " has no students!")));
			
			
			
		} catch (StudentHandlingException e) {
			
			e.printStackTrace();
		}

	}

}
