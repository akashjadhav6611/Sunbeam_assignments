package com.tester;

import static com.utils.CollectionUtils.populateStudentMap;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

import com.core.app.Student;

public class Test10 {
/*
10. Display student details from the map , sorted as per student's dob.
since this is a value based sorting criteria: convert to collection view
TreeMap will always sort on key
use HashMap -> use values() to Collection<Student>
Collection to stream
sorted(comparing or lambda exp) method --> forEach to display
hm.values.stream.sorted.foreach	
*/
	public static void main(String[] args) {
		Map<String, Student> map = populateStudentMap();
		Collection<Student> studentCollection = map.values();
		Comparator<Student> dobComparator = Comparator.comparing(Student::getDob);
		
		studentCollection
			.stream()
			.sorted(dobComparator)
			.forEach(System.out::println);
		

	}

}
