package lab_7;

import java.util.Scanner;

// User-defined exception
class NegativeNumberException extends Exception {
    public NegativeNumberException(String s) {
        super(s);
    }
}

class LAB7_3 {
    public void ProcessInput() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        if (num < 0) {
            throw new NegativeNumberException("Negative number entered: " + num);
        } else {
            System.out.println("Double of the entered number: " + num * 2);
        }
    }
    public static void main(String[] args) {
        LAB7_3 p1 = new LAB7_3();
        try {
            p1.ProcessInput();
        } catch (NegativeNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}




