import java.util.Random;
public class random_number {
	public static void main(String[] args) {
		Random rnd =new Random();
		int num1 = rnd.nextInt(52)+1;
		System.out.println(num1);
	}
}
