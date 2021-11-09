package tester;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

import static utils.CollectionUtils.*;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(Scanner sc = new Scanner(System.in))
		{
			List<Student> list=populateData();
			list.forEach(p->System.out.println(p));
			
			Subject s= Subject.valueOf(sc.next().toUpperCase());
		double sum=	list.stream().filter(p->p.getSubject()==s).mapToDouble(p->p.getGpa()).sum();
			System.out.println(sum);
		//	list.stream().sorted(s).forEach(p->System.out.println(p));
		
		}
	}

}
