package lab_5;
import java.util.Scanner;
interface Motor {
    Scanner sc = new Scanner(System.in);
    int capacity = sc.nextInt();

    void run();
    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing machine is running.");
    }

    public void consume() {
        System.out.println("Washing machine is consuming power.");
    }

    public void checkCapacity() {
        System.out.println("Enter the amount of capacity");
        System.out.println("Capacity of the washing machine: " + capacity);
    }
}

public class LAB5_2 {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.run();
        washingMachine.consume();
        washingMachine.checkCapacity();
    }
}