package assignment05;
import java.util.Arrays;
public class Qs05 {
    public static void main(String[] args)
    {
        // Initializing the first array
        int a[] = { 30, 25, 40, 23 };
  
        // Initializing the second array
        int b[] = { 30, 25, 40,23 };
  
        
        boolean result = Arrays.equals(a, b);
  
    
        if (result == true) {
            // Print the result
            System.out.println("Two arrays are equal");
        }
        else {
            // Print the result
            System.out.println("Two arrays are not equal");
        }
    }
}

