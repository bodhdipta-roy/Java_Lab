//-Write a program to print your name, roll no, section and branch in separate lines.

package lab_1;

import java.util.*;
 class exp1
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name,branch;
        int roll,section;
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter branch");
        branch= sc.nextLine();
        System.out.println("Enter roll");
        roll=sc.nextInt();
        System.out.println("Enter section");
        section=sc.nextInt();
        System.out.println("my name is : " + name);
        System.out.println(branch);
        System.out.println(roll);
        System.out.println(section);

    }
}
