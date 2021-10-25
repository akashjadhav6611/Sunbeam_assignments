package com.tester;
import java .util.Scanner;

import com.apps.fruits.*;

public class FruitBasket{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter basket size : ");
        Fruits[] fruits = new Fruits[sc.nextInt()];
        int counter = 0;
        boolean key = false;

        while(!key){

            System.out.println("\n1.Add mango");
            System.out.println("2.Add Orange");
            System.out.println("3.Add Apple");
            System.out.println("4.Display names of all fruits in basket.");
            System.out.println("5.Display name,color,weight , taste of all fresh fruits in the basket.");
			System.out.println("6.Display tastes of all stale(not fresh) fruits in the basket.");
			System.out.println("7.Mark a fruit as stale");
			System.out.println("8.Mark all sour fruits stale");
			System.out.println("9.Display all fruits ( fresh and stale)");
			System.out.println("10.Display taste n fruit specific functionality");
			System.out.println("\n11. Exit");
			System.out.println("Enter choice : ");
            switch (sc.nextInt()){

                case 1:
                    if(counter<fruits.length){
                        System.out.println("Enter Mango details : name color weight");
                        fruits[counter++] = new Mango(sc.next(),sc.next(),sc.nextDouble());
                    }
                    else{
                        System.out.println("Basket is full");
                    }
                    break;

                case 2:
                if(counter<fruits.length){
                    System.out.println("Enter Orange details : name color weight");
                    fruits[counter++] = new Orange(sc.next(),sc.next(),sc.nextDouble());
                }
                else{
                    System.out.println("Basket is full");
                }
                break;    

                case 3:
                if(counter<fruits.length){
                    System.out.println("Enter Apple details : name color weight");
                    fruits[counter++] = new Apple(sc.next(),sc.next(),sc.nextDouble());
                }
                else{
                    System.out.println("Basket is full");
                }
                break;

                case 4:
                    System.out.println("Names of all fruits in the basket.");
                    for(Fruits f : fruits)
                        if(f != null)
                            System.out.println(f.getName());
                    break;

                    case 5:
					System.out.println("Name,color,weight , taste of all fresh fruits in the basket.");
					for(Fruits f : fruits)
						if(f.isFresh() && f != null)
							System.out.println(f+" Taste : "+f.taste());
					break;  
                    
                    case 6:
					System.out.println("Stale(not fresh) fruits in the basket.");
					for(Fruits f : fruits)
						if(!(f.isFresh()) && f != null)
							System.out.println(f.getName()+" - "+f.taste());
					break;
					
				case 7:
					System.out.println("Enter index : ");
					int index = sc.nextInt();
					if(index < fruits.length)
					{
						fruits[index].setFresh(false);
						
					}else
						System.out.println("Invalid index !!!");
					break;
					
				case 8:
					for(Fruits f : fruits) {
						if(f != null && f.taste().equals("sour"))
							f.setFresh(false);
					}
					break;
					
				case 9:
					System.out.println("All fruits ( fresh and stale)");
					for(Fruits f : fruits)
						if(f != null)
							System.out.println(f);
					break;
					
				case 10:
						System.out.println("Display taste n fruit specific functionality");
						for(Fruits f : fruits) {
							if(f instanceof Apple) {
								((Apple)f).jam();
							}
							else if(f instanceof Mango) {
								((Mango)f).pulp();
							}
							else if(f instanceof Orange) {
								((Orange)f).juice();
							}
						}
							break;
					
				case 11:
					System.out.println("Exited the program !");
					key=true;
					break;
	
				default:
					System.out.println("Invalid Choice !!!");
					break;    
            }
        }
        sc.close();
    }
}