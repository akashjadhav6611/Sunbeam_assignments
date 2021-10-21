import java.util.Scanner;

public class TestBoxFunctionality {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Box dimensions and color : width depth height color");
        Box b1;
        b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.next());

        System.out.println("\nEnter Box dimensions and color : width depth height color");
        Box b2;
        b2 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.next());

        System.out.println("\nEnter cube side and color : ");
        Box b3;
        b3 = new Box(sc.nextDouble(),sc.next());

        System.out.println("\nBox b1 : "+b1.getBoxDimensions());
        System.out.println("\nBox b2 : "+b2.getBoxDimensions());
        System.out.println("\nBox b3 : "+b3.getBoxDimensions());

        System.out.println("\nVolume of b1 : " + b1.getBoxVolume()+"\nVolume of b2 : " + b2.getBoxVolume());
        System.out.println("\nEquality check of b1 and b2 : "+b1.isEqual(b2));

        Box b4;
        System.out.println("\nEnter offsets with respect Box dimensions and color : "+b1.getBoxDimensions()+"\nwidth depth height color");
        b4 = b1.createNewBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.next());
        System.out.println("\nBox b4 : "+b4.getBoxDimensions());

        if (b1.getBoxVolume() > b2.getBoxVolume()) 
            System.out.println("\nLarger volume is of box b1 and color is : "+b1.getcolor());   
        else if (b1.getBoxVolume() < b2.getBoxVolume()) 
            System.out.println("\nLarger volume is of box b2 and color is : "+b2.getcolor()); 
        else
            System.out.println("\nVolumes of b1 and b2 are equal");

        sc.close();

    }

}