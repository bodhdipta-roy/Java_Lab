package lab_3;
//Write a program in Java to create a class Rectangle having data members length and breadth and three methods called read, calculate and display to read the values of length and breadth, calculate the area and perimeter of the rectangle and display the result respectively.
import java.util.*;
public class Rectangle
{
    double length;
    double breadth;
    double area;
    double perimeter;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length=sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        breadth=sc.nextDouble();
    }
    public void calculate()
    {
        area=length*breadth;
        perimeter=2*(length+breadth);
    }
    public void display()
    {
        System.out.println("The area of the rectangle is: "+area);
        System.out.println("The perimeter of the rectangle is: "+perimeter);
    }
    public static void main(String[] args)
    {
        Rectangle r=new Rectangle();
        r.input();
        r.calculate();
        r.display();
    }
}
