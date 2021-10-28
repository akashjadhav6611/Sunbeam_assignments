package wrappers;

public class Test1 {

	public static void main (String [] args) {
		//Integer i1 =new Integer(1234); // cross mark is deprecated
		Integer i1 =Integer.valueOf(1234); // int ---> Integer (boxing)
		Double d1 = Double.valueOf(123.45); // boxing : double to Double
		int data =i1.intValue(); // unboxing Integer --- > int
		double data2 = d1.doubleValue(); // unboxing Double ----- > double
		Integer i2 =100; // int --- > Integer (autoboxing done by javac)  i2= Integer.valueOf(100) apne aap bulata hai 
		Double d2 =123.4567; //autob
		data =i2; // wrapper //autounbox (Integer -- > int) javac : data =i2.intValue() (andar bulata hai)
		Object s = "123456";
	//	s++;// pointer vs ref
		i1++; // 1. auto unbox happens (INTEger -- >int), 2. incre ,3.  auto box
		System.out.println(i1);
		d1 *=10; // 1. auto unbox (Double--> double) 2. multi and assign , 3. auto box
		System.out.println(d1);
		int i =12345;
		double j=i; // happens : because this is widening (auto promotion)
		//Double k=1234; // 1. auto box (int ---> Integer) 2. cant be converted to Double bcuz of same level of hierarchy
		Double k=(double) 1234; //or 1234d : double --- > Double (auto box)
		j=123.45f;
		//k=123.45f; // auto box  (float --> Float) XX impossible
		Number n1 =123.456F; //auto box (float --- > Float) is a NUMBER (hierarchy) (upcasting karrhe)
		n1=123; // works cuz byte is a number
		Object o =123.456F; // float to Float (autobox) ---- is a Object
		o=45;
		o=false; // boolean --- > Boolean is a Object
	}

}
