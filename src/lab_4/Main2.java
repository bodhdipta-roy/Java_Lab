package lab_4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length:");
        float length = scanner.nextFloat();
        System.out.println("Enter width:");
        float width = scanner.nextFloat();
        System.out.println("Enter height:");
        float height = scanner.nextFloat();
        System.out.println("Enter thickness:");
        float thickness = scanner.nextFloat();
        WoodBox woodBox = new WoodBox(length, width, height, thickness);
    }
}
