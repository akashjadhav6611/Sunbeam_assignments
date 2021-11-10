package com.tester;

import static com.utils.CollectionUtils.*;

import java.util.Map;

import com.core.app.Student;

public class Test8 {
/*
8. Display student details from the map
readymade higher order function
map -> forEach [takes a biconsumer]send the values part of it
*/
	public static void main(String[] args) {
		Map<String, Student> map = populateStudentMap();
		map.forEach((s, v) -> System.out.println(v));
	}

}
