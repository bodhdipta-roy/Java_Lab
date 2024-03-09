package lab_3;

import java.util.*;
public class Demo extends box
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        box b = new box();
        System.out.println("Input Length, Breadth and Height of the box:");
        b.length = sc.nextDouble();
        b.width = sc.nextDouble();
        b.height = sc.nextDouble();
        System.out.println("Volume of box is: " + b.volume());
    }
}