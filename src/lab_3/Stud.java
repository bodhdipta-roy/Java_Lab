package lab_3;
import java.util.*;
class Stud
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of students:");
        n=sc.nextInt();
        Student s[]=new Student[n];
        for(i=0;i<n;i++)
        {
            s[i]=new Student();
            System.out.println("Enter information of Student "+(i+1));
            s[i].input();
            System.out.println("###############################");
        }
        for(i=0;i<n;i++)
        {
            System.out.println("Details of Student "+(i+1));
            s[i].display();
            System.out.println("###############################");
        }
    }
}