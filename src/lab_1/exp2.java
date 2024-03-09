// Write a program to print the corresponding grade for the given mark using if..else statement in Java
package lab_1;
import java.util.Scanner;
public class exp2 {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        marks= sc.nextInt();
        if(marks>=90){
            System.out.println("O");
        }
        else if(marks>=80){
            System.out.println("E");
        }
        else if(marks>=60){
            System.out.println("A");
        }
        else if(marks>=40){
            System.out.println("B");
        }
        else {
            System.out.println("F");
        }
    }
}
