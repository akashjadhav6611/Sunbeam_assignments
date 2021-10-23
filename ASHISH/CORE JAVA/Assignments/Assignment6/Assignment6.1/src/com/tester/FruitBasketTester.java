package com.tester;
import java.util.Scanner;

import com.app.fruits.*;

public class FruitBasketTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter maximum capacity of fruits in the basket: ");
		Fruit[] fruitBasket = new Fruit[sc.nextInt()];
		
		boolean exit = false;
		int counter = 0;
		
		while(!exit)
		{
			System.out.println("MENU: ");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display all the names of fruits in the basket");
			System.out.println("5. Display color, weight taste of all fresh fruits");
			System.out.println("6. Display tastes of all stale fruits");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits as stale");
			System.out.println("9. Display taste n fruit specific functionality , for all the fruits in the basket");
			System.out.println("10. Exit");
			
			switch(sc.nextInt())
			{
			case 1:
				if(counter < fruitBasket.length)
				{
					System.out.println("Enter details for Mango as: Name color weight");
					fruitBasket[counter++] = new Mango(sc.next(), sc.next(), sc.nextDouble());
				}
				else
				{
					System.out.println("Basket full! Fruit can not added.");
				}
				break;
				
			case 2:
				if(counter < fruitBasket.length)
				{
					System.out.println("Enter details for Orange as: Name color weight");
					fruitBasket[counter++] = new Orange(sc.next(), sc.next(), sc.nextDouble());
				}
				else
				{
					System.out.println("Basket full! Fruit can not added.");
				}
				break;
				
			case 3:
				if(counter < fruitBasket.length)
				{
					System.out.println("Enter details for Apple as: Name color weight");
					fruitBasket[counter++] = new Apple(sc.next(), sc.next(), sc.nextDouble());
				}
				else
				{
					System.out.println("Basket full! Fruit can not added.");
				}
				break;
				
			case 4:
				System.out.println("Names of all fruits in the basket: ");
				for(Fruit f : fruitBasket)
				{
					if(f != null)
					{
						System.out.println(f.getName());
					}
				}
				break;
				
			case 5:
				System.out.println("Name, color, weight, taste of all fresh fruits in the basket:");
				for(Fruit f : fruitBasket)
				{
					if(f.getIsFresh() && f != null)
					{
						System.out.println(f.toString() + " " + f.taste());
					}
				}
				break;
				
			case 6:
				for(Fruit f : fruitBasket) 
				{
					if (f != null) {
						if (!f.getIsFresh()) {
							System.out.println(f.taste());
						}
					}
				}
				break;
				
			case 7:
				int index = sc.nextInt();
				if (index < fruitBasket.length && index >= 0)
				{
					fruitBasket[index].setIsFresh(false);
				}
				else 
				{
					System.out.println("Invalid index!!!!");
				}
				break;
				
			case 8:
				for(Fruit f : fruitBasket)
				{
					if(f != null)
					{
						if(f.taste().contains("sour"))
						{
							f.setIsFresh(false);
						}
					}
				}
				break;
				
			case 9:
				for(Fruit f : fruitBasket)
				{
					if(f != null)
					{
						System.out.println(f.taste());
						if(f instanceof Mango)
						{
							((Mango)f).pulp();
						}
						else if(f instanceof Apple)
						{
							((Apple)f).jam();
						}
						else if(f instanceof Orange)
						{
							((Orange)f).juice();
						}
					}
				}
				break;
				
			case 10:
				exit = true;
				break;
			}
		}
		sc.close();
	}
}
