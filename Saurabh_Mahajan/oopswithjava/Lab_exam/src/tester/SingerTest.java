package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.app.core.Singer;

import custom_exceptions.SingerHandlingException;

import static utils.CollectionUtils.populateSampleData;
import static utils.SingerUtils.*;

public class SingerTest {

	public static void main(String[] args) 
	{
		//using try with rss 
		try(Scanner scan = new Scanner(System.in))//try with rss starts
		{
			ArrayList<Singer> singers = populateSampleData();//added some sample data for testing
			
			boolean key = false;//for while loop iterations
			
			while(!key)//while starts
			{
				try {//try starts
					System.out.println("\n1.Add Singer 2.Remove Singer 3.Modify Singers rating "
							+ "\n4.Search singer by name 5. Sort singer by name 6.Display all singers \n0.Exit");
					switch(scan.nextInt())//switch starts
					{
					case 1:
						//user input[name,gender,age,email_id,contact,rating]
						System.out.println("Enter Singer details : name,gender,age,email_id,contact,rating");
						//calls this function and sccepts Singer instance
						Singer s = acceptRecord(scan.next(), scan.next(), scan.nextInt(), scan.next(), scan.next(), scan.nextInt());
						singers.add(s);
						//successfully added
						System.out.println("Singer record added...");
						break;
						
					case 2:
						//remove function internally uses equals method i.e primary key(email)
						
						System.out.println("Enter email id : ");
						System.out.println(singers.remove(findByEmail(scan.next(),singers)));
						System.out.println("Successfully removed...");
						break;
						
					case 3:
						//changing by setter of rating
						System.out.println("Enter email id : ");
						Singer s3 = findByEmail(scan.next(), singers);
						System.out.println("Enter new rating : ");
						s3.setRating(scan.nextInt());
						System.out.println("Rating modified...");
						break;
						
					case 4:
						//user input name
						System.out.println("Enter name : ");
						String name = scan.next();
						//checking equality with each instance
						for(Singer s4 : singers)
							if(name.equals(s4.getName()))
								System.out.println(s4);//print if found
						break;
						
					case 5:
						//sort internally does by compareTo overrided in Singer class
						Collections.sort(singers);
						System.out.println("Sorted by name...");
						break;
						
					case 6:
						//displaying all records by for each
						for(Singer s6 : singers)
							System.out.println(s6);
						break;
						
					case 0:
						//to exit the program
						System.out.println("Exited the program...");
						key = true;
						break;
						
					default:
						//if user inputs wrong choice
						System.out.println("Invalid choice !!!");
						break;
					}//switch ends
					
				}//try ends
				catch(IllegalArgumentException iae)
				{
					System.out.println(iae);
				}
				catch(SingerHandlingException she)
				{
					System.out.println(she);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
				scan.nextLine();//to clear scanner buffer otherwise throws infinite loop
			}//while ends
			
			
			
		}//try with rss ends
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
