package lab_3;
    import java.util.*;
    public class AreaCalculator
    {
        public double area(double radius)
        {
            return Math.PI * radius * radius;
        }

        public double area(double base, double height)
        {
            return 0.5 * base * height;
        }

        public double area(double sideLength,String square)
        {
            return sideLength * sideLength;
        }


        public static void main(String[] args)
        {
            AreaCalculator calculator = new AreaCalculator();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the shape (circle, triangle, square):");
            String shape = scanner.nextLine().toLowerCase();

            switch (shape) {
                case "circle" -> {
                    System.out.println("Enter the radius:");
                    double radius = scanner.nextDouble();
                    System.out.println("The area of the circle is " + calculator.area(radius));
                }
                case "triangle" -> {
                    System.out.println("Enter the base and height:");
                    double base = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    System.out.println("The area of the triangle is " + calculator.area(base, height));
                }
                case "square" -> {
                    System.out.println("Enter the side length:");
                    double sideLength = scanner.nextDouble();
                    System.out.println("The area of the square is " + calculator.area(sideLength, "square"));
                }
                default -> System.out.println("Invalid shape. Please enter circle, triangle, or square.");
            }
        }
    }

