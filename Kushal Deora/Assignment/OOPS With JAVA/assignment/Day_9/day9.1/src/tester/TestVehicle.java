package tester;

import java.util.Scanner;
import com.app.vehicle.*;
public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(Scanner sc = new Scanner(System.in))
{
	System.out.println("Enter Vehicle 1 Details: chasis no,color, Price");
	Vehicle v1=new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble());
	
	System.out.println("Enter Vehicle 2 Details: chasis no,color, Price");
	Vehicle v2=new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble());
	System.out.println(v1.equals(v2)?"Same":"Different");
}
	}

}
