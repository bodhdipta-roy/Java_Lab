package lab_6.LAB6_1.Marketing;

import lab_6.LAB6_1.General.employee;

import java.util.Scanner;


public class sales extends employee
{
    public sales(int empid, String ename, double basic)
    {
        super(empid, ename, basic);
    }

    public double tallowance()
    {
        return 0.05 * earnings();
    }

    public void printEarnings()
    {
        System.out.println("Employee ID: " + empid);
        System.out.println("Total Earnings: " + (earnings() + tallowance()));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee ID:");
        int eid = sc.nextInt();
        System.out.println("Enter the employee name:");
        sc.nextLine(); // consume the leftover newline
        String name = sc.nextLine();
        System.out.println("Enter the basic salary:");
        double salary = sc.nextDouble();
        sales salesPerson = new sales(eid, name, salary);
        salesPerson.printEarnings();
    }
}