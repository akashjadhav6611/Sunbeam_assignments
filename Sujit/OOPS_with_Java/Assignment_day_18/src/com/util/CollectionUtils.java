package com.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.app.data.Subject.*;
import static java.time.LocalDate.parse;
import com.app.data.Student;

public interface CollectionUtils {
	public static ArrayList<Student> populateData() {
		ArrayList<Student> student = new ArrayList<>();

		student.add(new Student("01", "Nami   ",  parse("1997-03-23"), JAVA, 9.1));
		student.add(new Student("02", "Robin  ",  parse("1992-08-03"), ANGULAR, 9.3));
		student.add(new Student("03", "Luffy  ",  parse("1997-12-14"), DBT, 10));
		student.add(new Student("04", "Sanji  ",  parse("1994-06-17"), REACT, 7.6));
		student.add(new Student("05", "Zoro   ",  parse("1992-08-28"), JAVA, 8.2));
		student.add(new Student("06", "Ussop  ",  parse("1995-09-21"), DBT, 3.9));
		student.add(new Student("07", "Chopper",  parse("2000-10-06"), SE, 4.0));
		student.add(new Student("08", "Franky ",  parse("1991-11-04"), SE, 6.1));
		student.add(new Student("09", "Jimbei ",  parse("1990-01-26"), ANGULAR, 8.9));
		return student;

	}

	public static Map<String, Student> studMap(List<Student> student1) {
		Map<String, Student> stud = new HashMap<>();

		for (Student s : student1) {
			stud.put(s.getRollno(), s);
		}
		return stud;

	}

}
