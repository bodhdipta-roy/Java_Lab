//Write a program in Java to take first name and last name from user and print both in one line as last name followed by first name
package lab_1;
import java.util.Scanner;

public class exp5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Full Name: " + lastName + " " + firstName);

        scanner.close();
    }
}
