//Write a program to print the week day for the given day no. of the current month using switch case statement.
package lab_1;
import java.util.Scanner;

public class exp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day number of the current month: ");
        int dayNumber = scanner.nextInt();
        if (dayNumber>31 || dayNumber<1){
            System.out.println("invalid");

        }
        else {
        
            switch (dayNumber % 7) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Invalid day number. Please enter a number between 1 and 7.");
            }
        }
        scanner.close();
    }
}
