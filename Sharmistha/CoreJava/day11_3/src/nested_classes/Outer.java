package nested_classes;

public class Outer {

	//can outer class contain static / non static : YES
		private int i;
		private static int j;
		static {
			j=100;
		}
		public Outer(int i) {
			this.i=i;
		}
		//static method
		public static void test1()
		{
			System.out.println("outer's static method" +j );
//			Inner in =new Inner(3456); // No because first create outer class inst
			Outer.Inner in = new Outer(11).new Inner(22);
			System.out.println(in.l);
		}
		//non static method :  already associated with outer class instance
		public void test2()
		{ 
//			cannot access inner class mem directly w/o instatntiation
//			System.out.println("outer's non stat method " + i + "" +j + " " + k + "" + l);
//			non static is implicitly assoc with "this"
			Inner in =new Inner(1234); // instance create of inner class 
			System.out.println("outer's non stat method" + Inner.k + "" +in.l );
		}
		// non static nested class :inner class
		class Inner
		{   
//			private static int k;
			private static final int k = 100; // static final constants are allowed
//			static {
//				
//			}
			private int l; //can declare non static data member
			public Inner(int l) { //can add constr (param or overloaded also)
				this.l=l;
			}
			//static method cant be added ever
////			public static void test3()
//			{
//				
//			}
			
			//can add non stat method 
			public void test4()
			{
				// accesses k,l both
				//can inner class access outer class mem directly (w/o creating instance of outer class) :yes
				System.out.println("inner non static method" + i + "" +j + "" + k + ""+ l);
			}
		}

}
