package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int choice;
System.out.println("Enter the Number of Co-ordinates");
Point2D p[] =new Point2D[sc.nextInt()];
for(int i=0;i<p.length;i++)
{
	System.out.println("Enter Co-ordinnates For "+(i+1)+" Point");
	p[i]=new Point2D(sc.nextInt(), sc.nextInt());
}

do
{
	System.out.println("1. Details of Specific Point 2. Display All Point 3. Display distance bw two points 4. Exit");
choice=sc.nextInt();
switch(choice)
{
case 1:
	
		System.out.println("Enter index value");
		int idx=sc.nextInt();
		if(idx>=0&&idx<p.length)
		{
			System.out.println(p[idx].getDetails());
		}
		else
		{
			System.out.println("Invalid Index Please Retry");
		}
		break;
case 2:
			for(Point2D p1:p)
				System.out.println("Point "+" "+p1.getDetails());
	break;
case 3:
	System.out.println("Enter index 1 value");
	int idx1=sc.nextInt();
	if(idx1>=0&&idx1<p.length)
	{
		System.out.println("Enter index 2 value");
		int idx2=sc.nextInt();
		if(idx2>=0&&idx2<p.length)
		{
			if(p[idx1].isEqual(p[idx2]))
			{
				 System.out.println("Both points are at same position");
			}
			else
			{
				 System.out.println("Distance: "+p[idx1].calculateDistance(p[idx2]));
			}
		}
		else
		{
			System.out.println("Invalid Index 2 Please Retry");
		}
	}
	else
	{
		System.out.println("Invalid Index 1 Please Retry");
	}
	break;
	
}
}while(choice!=4);
System.out.println("Exit Successfull");
sc.close();
	}

}
