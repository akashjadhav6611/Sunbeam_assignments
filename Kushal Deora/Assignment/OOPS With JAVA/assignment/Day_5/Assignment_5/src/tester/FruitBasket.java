package tester;

import com.app.fruits.*;
import java.util.Scanner;
import com.app.fruits.*;

public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Fruit");
		Fruits f[]=new Fruits[sc.nextInt()];
		int choice;
		int counter=0;
		do {
			System.out.println("1. Add Apple 2. Add Mango 3. Add Orange 4.Show All Names 5. Show All Fresh 6.Taste of Stale fruit 7. Make Stale 8. Mark all sour fruits stale  0. Exit");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				if(counter<f.length)
				{
					System.out.println("Enter Name, Weight, Color");
					f[counter++] =new Apple(sc.next(),sc.nextDouble(), sc.next());
				}
				else
				{
					System.out.println("Busket Full");
				}
				break;

			case 2:
				if(counter<f.length)
				{
					System.out.println("Enter Name, Weight, Color");
					f[counter++] =new Mango(sc.next(),sc.nextDouble(), sc.next());
				}
				else
				{
					System.out.println("Busket Full");
				}
				break;
			case 3:
				if(counter<f.length)
				{
					System.out.println("Enter Name, Weight, Color");
					f[counter++] =new Orange(sc.next(),sc.nextDouble(), sc.next());
				}
				else
				{
					System.out.println("Busket Full");
				}
				break;
			case 4:
						for(Fruits ff:f)
						{//null checking
							if(ff!=null)
							System.out.println(ff.getName());
						}
				break;
				
			case 5:
				for(Fruits ff:f)
				{//null checking
					if(ff.getisFresh()&&ff!=null)
					System.out.println(ff.toString());
				}
				break;
				
			case 6:
				for(Fruits ff:f)
				{//null checking
					if(!(ff.getisFresh())&&(ff!=null))
					System.out.println(ff.taste());
				}
				break;
				
			case 7:
				System.out.println("Enter index");
				int idx=sc.nextInt();
						
				if(idx>=0&&idx<f.length)
				{
					f[idx].setisFresh();
				}
				else
				{
					System.out.println("Invalid Index");
				}
				break;
				
			case 8:
				
				for(Fruits ff:f)
				{//null check
					if(ff!=null)
					if(ff.taste().contentEquals("sour"))
					{
						ff.setisFresh();
					}
				}
				break;
			}
			
		} while (choice!=0);
		
		





sc.close();
	}

}
