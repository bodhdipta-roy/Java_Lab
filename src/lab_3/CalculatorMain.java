package lab_3;
class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Using subtract method for integers
        int result1 = calculator.subtract(10, 5);
        System.out.println("Subtraction of two integers: " + result1);

        // Using subtract method for doubles
        double result2 = calculator.subtract(10.5, 5.2);
        System.out.println("Subtraction of two doubles: " + result2);
    }
}