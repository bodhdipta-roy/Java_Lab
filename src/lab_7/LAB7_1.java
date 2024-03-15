package lab_7;

import java.util.Scanner;

public class LAB7_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements (separated by spaces): ");
        for (int i = 0; i < size + 1; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Successfully entered elements.");

        scanner.close();
    }
}
