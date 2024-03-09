package lab_4;

import java.util.Scanner;

class Person extends Account {
    String name;
    String aadhar_no;

    @Override
    void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Enter Aadhar number:");
        aadhar_no = scanner.nextLine();
    }

    @Override
    void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar number: " + aadhar_no);
    }
}
