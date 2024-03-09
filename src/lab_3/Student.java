package lab_3;
import java.util.*;
public class Student
{
    String roll;
    String name;
    double cgpa;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roll:");
        roll=sc.nextLine();
        System.out.println("Enter Name:");
        name=sc.nextLine();
        System.out.println("Enter CGPA:");
        cgpa=sc.nextDouble();
    }
    public void display()
    {
        System.out.println("The roll number of the student is: " + roll);
        System.out.println("The name of the student is: " + name);
        System.out.println("The cgpa of the student is: " + cgpa);
    }
}
