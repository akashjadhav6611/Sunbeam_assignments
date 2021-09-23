//Print the area and circumference of a circle, given its radius=3.
package LAB;

public class Main {

    public static void main(String[] args) {
	System.out.println("Given data: Radius of circle= 3cm");
	int radius= 3;
	System.out.println("Find Area (A) and Circumference (C) of the circle.");
    float pi = (float) Math.PI;
    float area = pi*radius*radius;
    float circumference = 2*pi*radius;
    System.out.printf("A= %.3f cm^2",area);
    System.out.printf("\nC= %.3f cm",circumference);

    }
}

