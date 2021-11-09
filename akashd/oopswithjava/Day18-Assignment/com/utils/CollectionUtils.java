package com.utils;

import static java.time.LocalDate.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.core.app.Student;
import static com.enums.Subject.*;

public interface CollectionUtils {
	public static ArrayList<Student> populateStudentList() {
		ArrayList<Student> list = new ArrayList<>();
		//(String rollNo, String name, LocalDate dob, Subject subject, double gpa)
		list.add(new Student("01", "dean", parse("1995-03-28"), REACT, 3.52));
		list.add(new Student("02", "crowley", parse("1975-10-18"), JAVA, 9.95));		
		list.add(new Student("03", "eileen", parse("1999-08-09"), ANGULAR, 8.23));
		list.add(new Student("04", "mary", parse("1988-06-25"), SE, 4.76));
		list.add(new Student("05", "sam", parse("1998-01-01"), JAVA, 7.95));
		list.add(new Student("06", "richard", parse("1996-03-28"), REACT, 4.82));
		list.add(new Student("07", "april", parse("1985-10-18"), JAVA, 9.95));		
		list.add(new Student("08", "june", parse("1993-08-09"), ANGULAR, 2.23));
		list.add(new Student("09", "holly", parse("1989-06-25"), SE, 9.76));
		list.add(new Student("10", "eric", parse("1992-01-01"), JAVA, 6.95));
		
		return list;
	}
	
	public static Map<String, Student> populateStudentMap() {
		Map<String, Student> map = new HashMap<>();
	
		ArrayList<Student> list = populateStudentList();
		for (Student s : list)
			map.put(s.getRollNo(), s);
		
		return map;
	}
}
