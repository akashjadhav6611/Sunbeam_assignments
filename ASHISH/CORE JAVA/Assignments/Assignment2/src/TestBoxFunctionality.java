import java.util.Scanner;

class TestBoxFunctionality {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st box dims n color: w d h color");
        Box b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.next());

        System.out.println("Enter 2nd box dims n color: w d h color");
        Box b2 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.next());

        System.out.println(b1.isEqual(b2) ? "SAME" : "DIFFERENT");

        System.out.println("Enter offsets in Box 1's dims and color : woff doff hoff color");

        Box b3 = b1.createNewBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.next());

        System.out.println("new b3 " + b3.getBoxDimensions());

        if(b1.getBoxVolume() > b2.getBoxVolume())
        {
            if(b1.getBoxVolume() > b3.getBoxVolume())
            {
                System.out.println("The color of the box having largest volume is " + b1.getColor());
            }
            else
            {
                System.out.println("The color of the box having largest volume is " + b3.getColor());
            }
        }
        else
        {
            if(b2.getBoxVolume() > b3.getBoxVolume())
            {
                System.out.println("The color of the box having largest volume is " + b2.getColor());
            }
            else
            {
                System.out.println("The color of the box having largest volume is " + b3.getColor());
            }
        }
        sc.close();
    }
}