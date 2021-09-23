import java.util.Scanner;

public class Que_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch = 'a';
		int count = 0;
	    int product = 1;
		int i = 0;

	    while(ch != 'q') {
		System.out.println("Enter Next Number or enter q: ");
		String s = scan.next();
		if (s.charAt(0) == 'q') {
			ch = 'q';
		}
		else {
			int x = Integer.parseInt(s);
			count = count + x;
		    product = product*x;
			i++;
			}
	    }
	    
	    System.out.println("i is: " + i);
	    double avg = (double)count/(double)i;
	    System.out.println("Digit sum is: " + count);
	    System.out.println("Digit average is: " + avg);
	    System.out.println("Digit prodcut is: " + product);

	}

}
