 import java.util.Scanner;
 class TestBox {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Dimensions L W H Color");
        Box b1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.next());
        System.out.println( b1.getDimensions());
            System.out.println( "Volume "+b1.getVolume());

           
        sc.close();
    }
}
