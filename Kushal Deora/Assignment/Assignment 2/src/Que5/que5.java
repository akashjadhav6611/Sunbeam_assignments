package Que5;

import java.util.Scanner;

public class que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner sc =new Scanner(System.in);
		int evn=0;
		int odd=0;
		int pt=0;
		int nv=0;
		int z=0;
		int num;
		for(int i=0;i<20;i++)
		{
			num=sc.nextInt();
			if(num>0)
				pt++;
			if(num<0)
				nv++;
			if(num%2==0)
				evn++;
			if(num%2!=0)
				odd++;
			if(num==0)
				z++;
		}
		System.out.println("Positive: "+pt);
		System.out.println("Negative: "+nv);
		System.out.println("Even: "+evn);
		System.out.println("Odd: "+odd);
		System.out.println("Zero: "+z);
	}

}
