import java.util.Arrays;

public class Ass5_1 {

	public static void main(String[] args) {
		int[] arr = new int[] {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		int[]sub = Arrays.copyOfRange(arr, 3, 8);
		System.out.println("Array is :");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
		}
		System.out.println("Sub Array is :");
		
		for(int i=0;i<sub.length;i++) {
			System.out.println(sub[i]+"\t");
		}

	}

}
