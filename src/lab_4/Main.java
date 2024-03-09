package lab_4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length:");
        float length = scanner.nextFloat();
        System.out.println("Enter width:");
        float width = scanner.nextFloat();
        System.out.println("Is the shape 3D? (yes/no)");
        String is3D = scanner.next();
        if (is3D.equalsIgnoreCase("yes")) {
            System.out.println("Enter height:");
            float height = scanner.nextFloat();
            Shape3D shape = new Shape3D(length, width, height);
            System.out.println("The cost of the plastic is Rs " + shape.calculateCost());
        } else {
            Shape2D shape = new Shape2D(length, width);
            System.out.println("The cost of the plastic is Rs " + shape.calculateCost());
        }
    }
}
