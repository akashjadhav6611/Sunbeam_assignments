package com.tester;

import java.util.ArrayList;
import java.util.Comparator;
import static java.util.Comparator.*;

import com.core.app.Student;
import com.utils.CollectionUtils;

public class Test2 {
/* 
2. Display all student details sorted as per GPA
using single java statement, use stream --> sort (sorted with comparator, use lambda exp/function literal / comparing method) --> forEach
 */
	public static void main(String[] args) {
		ArrayList<Student> list = CollectionUtils.populateStudentList();
		list.stream().sorted(comparing(Student::getGpa)).forEach(System.out::println);

		System.out.println("---------OR-----------");
		Comparator<Student> gpaComp = comparing(Student :: getGpa);
		list.stream().sorted(gpaComp).forEach(System.out::println);
	}

}
