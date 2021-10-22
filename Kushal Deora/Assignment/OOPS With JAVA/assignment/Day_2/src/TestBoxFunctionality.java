import java.util.Scanner;
 class TestBoxFunctionality {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Side ,Color");
        Box b1=new Box(sc.nextDouble(),sc.next());
        System.out.println( b1.getDimensions());
        System.out.println( "Volume "+b1.getVolume());
        
        System.out.println("Enter Dimensions L W H Color");
        Box b2=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.next());
    
        System.out.println("Enter Dimensions L W H Color");
        Box b3=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.next());

            if(b2.isEqual(b3))
            {
                System.out.println("Box are Equal");
            }
            else
            {
                System.out.println("Not Equal");
            }
            System.out.println("Enter Offset Dimensions L W H");
            Box b4=b3.createNewBox(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
            System.out.println(b4.getDimensions());
            System.out.println("Enter Dimensions L W H Color");
            Box b5=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.next());
            if(b5.getVolume()>b4.getVolume())
            {
                System.out.println("Color: "+b5.getColor());

            }
            else
            {
                System.out.println("Color: "+b4.getColor());
            }
        sc.close();
     }
   
}
