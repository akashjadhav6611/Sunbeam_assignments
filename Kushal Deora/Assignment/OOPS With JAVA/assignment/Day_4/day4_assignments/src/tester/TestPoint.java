package tester;
import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Co-ordinates");
        Point2D p1=new Point2D(sc.nextInt(), sc.nextInt());
        System.out.println("Enter Second Co-ordinates");
        Point2D p2=new Point2D(sc.nextInt(), sc.nextInt());
        System.out.println(p1.getDetails());
        System.out.println(p2.getDetails());
            if(p1.isEqual(p2))
            {
                System.out.println("Both are at same position");
            }
            else{
                System.out.println("Distance: "+p1.calculateDistance(p2));
            }

        sc.close();
    }
}
