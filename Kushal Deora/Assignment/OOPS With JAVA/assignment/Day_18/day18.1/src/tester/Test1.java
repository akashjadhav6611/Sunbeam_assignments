package tester;

import java.util.List;
import java.util.Scanner;

import com.app.core.Student;

import static utils.CollectionUtils.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(Scanner sc = new Scanner(System.in))
		{
			List<Student> list=populateData();
			list.forEach(p->System.out.println(p));
		}
	}

}
