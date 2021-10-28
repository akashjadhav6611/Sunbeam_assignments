package nested_classes;

public class Outer2 {

	private int i=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Outer2 outer = new Outer2();
Outer2.Inner2 in =outer.new Inner2(); // make inner instance with outer instance together

in.show(30);
	}
	class Inner2 
	{
		private int i=20;
		void show(int i)// line 12 (unhides just above wala i)
		{
			System.out.println(i); // from line 12 : 30
			System.out.println(this.i);//20
			System.out.println(Outer2.this.i); // i from outer class :10
		}
	}
	

}

            
