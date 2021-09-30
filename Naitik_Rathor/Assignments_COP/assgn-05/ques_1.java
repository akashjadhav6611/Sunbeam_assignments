package sub_array;
import java.util.Scanner;
import java.util.Arrays;
public class ques_1{

	public static void main(String[] args) {
		
		int[] a = new int[]{ 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
		int[] b = new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sub Array:");
		for(int i=0;i<b.length;i++)
		    b[i]=sc.nextInt();
		 int return1=0;
		 int return2=0;
	
		for(int i=0; i<a.length; i++) {
			
			if(a[i]==b[0]){
			    return1=i;
			    return2=i+4;
			}
		}
		
		System.out.println("Array original:"+Arrays.toString(a));
		System.out.println("Sub Array:"+Arrays.toString(b));
		System.out.println("Your sub-array lies from index "+return1+" to index "+return2);
		sc.close();
	}
}
