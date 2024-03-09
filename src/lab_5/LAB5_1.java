import java.util.*;

public class LAB5_1 {
    public static void main(String[] args) {
        Kiitian kiitian = new Kiitian();
        kiitian.getInput();
        System.out.println("Roll number: " + kiitian.rollNo);
        System.out.println("Registration number: " + kiitian.regNo);
        System.out.println("Course: " + kiitian.course());
    }

    static class Kiitian extends Student {
        String course() {
            return "B.Tech. (Computer Science & Engg)";
        }
    }

    abstract static class Student {
        int rollNo;
        int regNo;

        void getInput() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter roll number:");
            rollNo = scanner.nextInt();
            System.out.println("Enter registration number:");
            regNo = scanner.nextInt();
        }

        abstract String course();
    }
}