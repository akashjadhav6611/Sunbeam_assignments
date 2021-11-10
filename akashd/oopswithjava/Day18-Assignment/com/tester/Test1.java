package com.tester;

import java.util.ArrayList;

import com.core.app.Student;
import com.utils.CollectionUtils;

public class Test1 {
/*
1. Display all student details from a list
conversion to stream not required
Iterable's for each
try lambda, then method ref
*/
	public static void main(String[] args) {
		ArrayList<Student> list = CollectionUtils.populateStudentList();
		list.stream().forEach(s -> System.out.println(s));
		
		System.out.println("--------OR-----------");
		list.stream().forEach(System.out::println);
		
		System.out.println("--------OR-----------");
		for(Student s : list)
			System.out.println(s);
	}
	
}
