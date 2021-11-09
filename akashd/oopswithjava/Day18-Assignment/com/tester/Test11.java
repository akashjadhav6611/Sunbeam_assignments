package com.tester;

import java.util.Comparator;
import java.util.TreeMap;

import com.core.app.Student;
import com.utils.CollectionUtils;

/*
11. Display student details from the map, sorted as per sudent's roll number (descending)
TreeMap(Comparator <? super K> comparator) : empty tree map
populate it using putAll (hash map) as per descending order of the roll no.
*/
public class Test11 {

	public static void main(String[] args) {
		//TreeMap​(Comparator<? super K> comparator)
		//Comparator<Student> rollComparator = Comparator.comparing(Student::getRollNo, (r1, r2) -> r2.compareTo(r1));
		Comparator<String> rollComp = (r1, r2) -> r2.compareTo(r1);
		TreeMap<String, Student> treeMap = new TreeMap<>(rollComp);
		treeMap.putAll(CollectionUtils.populateStudentMap());
		treeMap.forEach((roll, student) -> System.out.println(student));
		
		
	}

}
