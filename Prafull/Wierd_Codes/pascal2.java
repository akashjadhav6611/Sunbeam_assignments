// Pascal's triangle in java using recursion
import java.util.Scanner;
public class pascal2 
{
   public static void display(int num)
   {
      for(int a = 0; a < num; a++)
      {
         for(int b = 0; b <= a; b++)
         {
            System.out.print(pascalTriangle(a, b) + " ");
         }
         System.out.println();
      }
   }
   public static int pascalTriangle(int a, int b)
   {
      if(b == 0 || b == a)
      {
         return 1;
      }
      else
      {
         return pascalTriangle(a - 1, b - 1) + pascalTriangle(a - 1, b);
      }
   }
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter number of rows: ");
      int row = sc.nextInt();
      display(row);
      sc.close();
   }
}