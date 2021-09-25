import java.util.Scanner;

public class ques_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[20];
		System.out.println("Enter 20 Numbers");
		for(int i=0;i<20;i++)
			arr[i]=sc.nextInt();
		System.out.print("Your Numbers Are: ");
		for(int i=0;i<20;i++)
			System.out.print(" "+arr[i]);
		System.out.println();
		int even_count=0,odd_count=0,positive=0,negative=0,temp,zeroes=0;
		for(int i=0;i<20;i++) {
			if(arr[i]>0)
				positive+=1;
			if(arr[i]<0)
				negative+=1;
			if(arr[i]%2==0)
				even_count+=1;
			if(arr[i]%2!=0)
				odd_count+=1;
			while(arr[i]!=0) {
				temp=arr[i]%10;
				arr[i]=arr[i]/10;
				if(temp==0)
					zeroes+=1;
			}
		}
		System.out.println("There are "+positive+" positive numbers.");
		System.out.println("There are "+negative+" negative numbers.");
		System.out.println("There are "+even_count+" even numbers.");
		System.out.println("There are "+odd_count+" odd_count numbers.");
		System.out.println("There are "+zeroes+" 0's only.");
	}

}
