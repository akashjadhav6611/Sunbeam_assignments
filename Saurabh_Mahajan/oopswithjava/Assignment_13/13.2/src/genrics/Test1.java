package genrics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Emp> emps = Arrays.asList(new Emp(), new Emp(), new Emp(), new Emp());
		List<Mgr> mgrs = Arrays.asList(new Mgr(), new Mgr(), new Mgr(), new Mgr());
		
		System.out.println("Emp : "+emps);
		System.out.println("Mgr : "+mgrs);
		Collections.copy(emps, mgrs);
		System.out.println("After copying mgr in emp : ");
		System.out.println("Emp : "+emps);

	}

}
