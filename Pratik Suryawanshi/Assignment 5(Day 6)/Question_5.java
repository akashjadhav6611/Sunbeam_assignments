//Write a Java program to check if two arrays are equal.

package Questions;
import java.util.Arrays;

public class question_5 {
	public static void main(String[] args) {
		int arr1[]=new int[] {10,12,20,30};
		int arr2[]=new int[] {20,30,12,10};
		int l,m,t=0;
		l=arr1.length;
		m=arr2.length;
		while(l==m)
		{
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i=0;i<l;i++) //Array 1(arr1)
			{
				for(int j=0;j<m;j++) //Array 2(arr2)
				{
					if(arr1[i]==arr2[j])//if arr1==arr2
					{
						t=1;  
					}	
					else 
					{
						t=0;	
					}
				}
			}
			break;
		}
	
		if(t==1) {
			System.out.println("Both Arrays are equal");
			
		}
		else {
			System.out.println("Both Arrays are not equal");
			
		}
	}

}
