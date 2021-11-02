package com.tester;

import java.text.ParseException;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

import com.app.details.Book;
import static com.app.details.Book.sdf;
import com.app.details.Category;

public class HashSetTester {

	public static void main(String[] args) throws ParseException
	{
		Scanner scan = new Scanner(System.in);
		HashSet<Book> books = new HashSet<>();
		LinkedHashSet<Book> lbooks;
		TreeSet<Book> tbooks = new TreeSet<Book>(new Comparator<Book>() 
		{
		    public int compare(Book b1, Book b2) 
		    {
		    	int temp = b1.getDate().compareTo(b2.getDate());
		    	if(temp == 0)
		    	{
		    		return 1;
		    	}
		    	return temp;
		    }
		});
		
		
		boolean key = false;
		while(!key)
		{
			System.out.println("0.Exit 1.Add a book 2.Display all books 3.LinkedHashSet 4.Sort by date");
			switch (scan.nextInt()) {
			case 1:
				//String isbn, Category category, double price, 
				//Date publishDate, String authorName, int quantity
				System.out.println("Enter book details : isbn category price date author quantity");
				Book b = new Book(scan.next(),
						convertCategory(scan.next()),
						scan.nextDouble(),
						parseDate(scan.next()),
						scan.next(),
						scan.nextInt()
						);
				System.out.println("Added : "+books.add(b));
				break;
				
			case 2:
				System.out.println("Details : ");
				System.out.println(books);
				break;
				
			case 3:
				System.out.println("Details by LHS : ");
				lbooks = new LinkedHashSet<Book>(books);
				System.out.println(lbooks);
				break;
				
			case 4:
				System.out.println("Sort by publish date : ");
				tbooks.addAll(books);
				System.out.println(tbooks);
				break;
				
			case 0:
				System.out.println("Exited the program...");
				key = true;
				break;
				
			default:
				System.out.println("Invalid choice !!!");
				break;
			}
			scan.nextLine();
		}

		scan.close();
	}
	
	public static Date parseDate(String temp) throws ParseException
	{
		return sdf.parse(temp);
	}
	
	public static Category convertCategory(String temp)
	{
		return Category.valueOf(temp.toUpperCase());
	}

}
