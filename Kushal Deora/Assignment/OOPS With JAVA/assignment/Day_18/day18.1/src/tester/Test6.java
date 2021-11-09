package tester;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

import static utils.CollectionUtils.*;
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(Scanner sc = new Scanner(System.in))
		{
			List<Student> list=populateData();
			list.forEach(p->System.out.println(p));
			
			Subject s= Subject.valueOf(sc.next().toUpperCase());
		list.stream().filter(p->p.getSubject()==s).filter(p->p.getGpa()<5.0).forEach(p->System.out.println(p.getName()));
			//System.out.println(max);
		//	list.stream().sorted(s).forEach(p->System.out.println(p));
		
		}
	}

}
