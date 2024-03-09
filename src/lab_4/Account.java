package lab_4;

import java.util.Scanner;

class Account {
    int acc_no;
    float balance;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number:");
        acc_no = scanner.nextInt();
        System.out.println("Enter balance:");
        balance = scanner.nextFloat();
    }

    void disp() {
        System.out.println("Account number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}
