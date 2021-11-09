package tester;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.core.Student;

import static utils.CollectionUtils.*;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(Scanner sc = new Scanner(System.in))
		{
			List<Student> list=populateData();
			list.forEach(p->System.out.println(p));
			list.sort((p1,p2)->((Double)p1.getGpa()).compareTo(p2.getGpa()));
			System.out.println();
			list.forEach(p->System.out.println(p));
		//	list.stream().sorted(s).forEach(p->System.out.println(p));
		
		}
	}

}
