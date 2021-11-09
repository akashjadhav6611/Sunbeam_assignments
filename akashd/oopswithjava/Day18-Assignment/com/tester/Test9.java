package com.tester;

import java.util.TreeMap;

import com.core.app.Student;
import com.utils.CollectionUtils;
import static java.util.Comparator.*;
/*
9. Display student details from the map , sorted as per student's roll no.
since it's a key based sorting, do it with a treeMap
3rd constructor, TreeMap(Map<K, V> map) and use forEach over TreeMap
[Entry set can be done hee, answer in one line]

*/
public class Test9 {
	public static void main(String[] args) {
		TreeMap<String, Student> treeMap = new TreeMap(CollectionUtils.populateStudentMap());
		treeMap.forEach((rollno, student) -> System.out.println(student));
	}
	
}
