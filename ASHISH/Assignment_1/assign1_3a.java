package assignment1;

import java.util.Scanner;

public class assign1_3a {
	
	public static void main(String args[])
	{
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a == 1)
		{
			System.out.println("ONE");
		}
		else
		{
			if(a == 2)
			{
				System.out.println("TWO	");
			}
			else
			{
				if(a == 3)
				{
					System.out.println("THREE");
				}
				else
				{
					if(a == 4)
					{
						System.out.println("FOUR");
					}
					else
					{
						if(a == 5)
						{
							System.out.println("FIVE");
						}
						else
						{
							if(a == 6)
							{
								System.out.println("SIX");
							}
							else
							{
								if(a == 7)
								{
									System.out.println("SEVEN");
								}
								else
								{
									if(a == 8)
									{
										System.out.println("EIGHT");
									}
									else
									{
										if(a == 9)
										{
											System.out.println("NINE");
										}
										else
										{
											System.out.println("OTHER");
										}
									}
								}
							}
						}
					}
				}
			}
		}
		sc.close();
	}
}
