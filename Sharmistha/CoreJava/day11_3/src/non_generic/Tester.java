package non_generic;

public class Tester {

	public static void main(String [] args) {
		//create a holder class interface to hold int value
		Holder h1 = new Holder(100); //wrapper apps (int--> Integer (autobox)--> Object (upcasting))
		//int data=h1.getReference(); // error bcuz downcasting karna hoga (object to int kese krega implicitly?)
		int data=(Integer)h1.getReference(); // explicit downcasting (Object --- >Integer -- >int)
		//aautobox (Integer -- >int)
		
		Holder h2 =new Holder("Abcd");// upcasting happening (String to Object)
		String s=(String)h2.getReference(); // explicit downc Object to String
		h1=h2;// same type : Holder
		data=(Integer)h1.getReference(); //downcasting so works fine // classcastException :string to Integer
		System.out.println(data);
		// runtime exception bcuz String cannot cast to Integer at h1=h2
		
	} 

}
