package com.tester;
import java.util.Scanner;

import com.sunbeam.core.Box;

public class TestFun {

    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st box dimensions and color : w d h color");
    Box b1 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.next());
    System.out.println("Box 1's address " + b1.hashCode());
    System.out.println("Enter 2nd box dimensions : w d h color");
    Box b2 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.next());
    System.out.println("Box 2's addr "+b2.hashCode());
    System.out.println(b1.isEqual(b2) ? "SAME" :"DIFFERENT");
    System.out.println("Enter offsets in Box 1's dimensions : woff doff hoff");

    Box b3 = b1.createNewBox(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
    System.out.println("Box 3's addr " + b3.hashCode());
    System.out.println("new box's dims " + b3.getBoxDimensions());
    sc.close();
}
}