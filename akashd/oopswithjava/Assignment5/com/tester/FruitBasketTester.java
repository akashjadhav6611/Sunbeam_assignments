package com.tester;
import com.app.fruits.*;
import java.util.Scanner;

public class FruitBasketTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of max fruits in the fruit basket");
		Fruit[] fruitBasket = new Fruit[sc.nextInt()];
		
		boolean exit = false;
		int counter = 0;
		while(!exit) {
			System.out.println("Menu: ");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display all the names of fruits in the basket");
			System.out.println("5. Display color, weight taste of all fresh fruits");
			System.out.println("6. Display tastes of all stale fruits");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits as stale");
			System.out.println("9. Display all fruits");
			System.out.println("10. Exit");
			switch(sc.nextInt()) {
			case 1: // Add mango
				if(counter < fruitBasket.length) {
					//fruitBasket[counter++] = new Mango("Alphonso mango", "Yellow", 500);
					System.out.println("Enter details for Mango as: Name color weight");
					fruitBasket[counter++] = new Mango(sc.next(), sc.next(), sc.nextDouble());
				}
				else
					System.out.println("Basket full! Fruit not added.");
				break;
			case 2: // Add orange
				if(counter < fruitBasket.length) {
					//fruitBasket[counter++] = new Orange("Nagpuri orange", "Orange", 250);
					System.out.println("Enter details for Orange as: Name color weight");
					fruitBasket[counter++] = new Orange(sc.next(), sc.next(), sc.nextDouble());
				}
				else
					System.out.println("Basket full! Fruit not added.");
				break;
			case 3: // Add apple
				if(counter < fruitBasket.length) {
					//fruitBasket[counter++] = new Apple("Kashmiri Apple", "Yellow", 200);
					System.out.println("Enter details for Apple as: Name color weight");
					fruitBasket[counter++] = new Apple(sc.next(), sc.next(), sc.nextDouble());
				}
				else
					System.out.println("Basket full! Fruit not added.");
				break;
			case 4: // Display all the names of fruits in the basket
				for(Fruit f : fruitBasket) {
					if(f != null)
					System.out.println(f.getName());
				}
				break;
			case 5: // Display color, weight taste of all fresh fruits
				for(Fruit f : fruitBasket) {
					if(f.getIsFresh() && f != null)
						System.out.println(f.getColor() + ", " + f.getWeight() + ", " + f.taste());
				}
				break;
			case 6: // Display tastes of all stale fruits
				for(Fruit f : fruitBasket) {
					if(!(f.getIsFresh()) && f!= null )
						System.out.println(f.taste());
				}
				break;
			case 7: // Mark a fruit as stale
				System.out.println("Enter index to change fresh status");
				int tempIndex = sc.nextInt();
				if(tempIndex < fruitBasket.length) {
					fruitBasket[tempIndex].setIsFresh(false);
				} else
					System.out.println("Invalid index");
				break;
			case 8: // Mark all sour fruits as stale
				for(Fruit f : fruitBasket) {
					if(f != null && f.taste().equals("Sour"))
						f.setIsFresh(false);
				}
				break;
			case 9: // test: Display all fruits
				for(Fruit f : fruitBasket) {
					if(f != null)
						System.out.println(f);
				}
				break;
			case 10: // exit
				exit = true;
				break;
			}
		}
		
		sc.close();
	}

}
