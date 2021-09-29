
public class Que_1 {

	public static void main(String[] args) {
		
		int[] a = new int[]{ 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
		int[] b = new int[10];
		int j = 0;
		for(int i=3; i<=8; i++) {
			
			b[j] = a[i];
			System.out.print(a[i]+"	");
			System.out.println(b[j]);
			j++;
		}
	}
}
