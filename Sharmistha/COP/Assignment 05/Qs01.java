package assignment05;
import java.util.*;

public class Qs01 {
	
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

int[] a = new int[] {10,12,20,30,25,40,32,31,35,50,60};

int[] sub = Arrays.copyOfRange(a,3,9);

System.out.println("Array is : ");

for(int i = 0; i < a.length; i++){

System.out.println(a[i]+"\t");

}

System.out.println("SubArray is : ");

for(int i = 0; i < sub.length; i++){

System.out.print(sub[i]+"\t");

}

}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
