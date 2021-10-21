package com.tester;
import com.app.fruits.*;
import java.util.*;

public class FruitBasket {

	public static void main(String[] args) {
		
		Scanner sm = new Scanner(System.in);
        
		//creating array of reference which will hold all Fruits details......
		System.out.println("Enter number types of fruit you want: ");
		Fruit[] fruitn = new Fruit[sm.nextInt()];
		
		// Set counter for checking......
		int count = 0;
		
		int ch = 0;
		
		while(ch != 10) {
			
			System.out.println("1.Add Apple 2.Add Orange 3.Add Mango 4.Show Names 5.Fruit Info");
			System.out.println("6.(Stale) Taste 7.Mark Stale Fruit 8.Mark All Sour Stale 10.Exit");
			System.out.println("Enter Your Choice....");
			switch (sm.nextInt()) {
		
			//Enter details for Apple:
			case 1:
				if(count < fruitn.length) {
					System.out.println("Enter Apple 'color' 'weight' 'name'");
				    fruitn[count++] = new Apple(sm.next(), sm.nextDouble(), sm.next());
				}else
					System.out.println("No Space In Basket!!!!!");
				break;
				
		    //Enter details for Orange:
			case 2:
				if(count < fruitn.length) {
					System.out.println("Enter Orange 'Color' 'Weight' 'Name'");
				    fruitn[count++] = new Orange(sm.next(), sm.nextDouble(), sm.next());
				}else
					System.out.println("No Space In Basket!!!!!");
				break;
				
			//Enter details for Mango:		
			case 3:
				if(count < fruitn.length) {
					System.out.println("Enter Mango 'Color' 'Weight' 'Name'");
				    fruitn[count++] = new Mango(sm.next(), sm.nextDouble(), sm.next());
				}else
					System.out.println("No Space In Basket!!!!!");
				break;
            
			// To get Info Of All Fruits:     
			case 4:
				for(Fruit f : fruitn)
					if(f != null)
				System.out.println("Names of Fruits are: "+f.getName());
		
			//to get Info Of Specific Fruit
			case 5:
				System.out.println("Enter the Index of Fruit: ");
				int index = sm.nextInt();
      
					if(fruitn[index].isFresh() && fruitn != null && index < fruitn.length)
				System.out.println("Info of Fruit is: "+fruitn[index].toString() + " Fruit Taste is: "+  fruitn[index].taste());	
				break;
			
			//To display Taste of Stale Fruit:
			case 6:
				System.out.println("Taste of Stale fruits in the basket");
				for(Fruit f : fruitn)
				   if((f.isFresh() == false) && f != null)
				System.out.println("Name: "+f.getName()+" Taste: "+f.taste());
				break;
			
			case 7:
				System.out.println("Enter the Index of Fruit: ");
			    index = sm.nextInt();
				
					if(index < fruitn.length) {
						fruitn[index].setFresh(false);
					}else
						System.out.println("Enter Correct Index....");
					
		// Mark all Sour As Stale:
			case 8:
				for(Fruit f : fruitn) {
					if(f != null && f.taste().equals("sour"))
						f.setFresh(false);
				}
				break;
				
			case 10:
				break;
			
		
		    default:
		    	System.out.println("Enter the Correct Choice.....");
		    	break;
		
			}
		}
		
		sm.close();
	}

}
