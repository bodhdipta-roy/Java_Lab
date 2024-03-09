import java.util.*;

interface Employee{
    double earning(double basics);
    double deduction(double basics);
    double bonus(double basics);
}
abstract class Manager implements Employee{
    public double earning(double basics){
        double DA = 0.8*basics;
        double HRA = 0.15*basics;
        return basics + DA + HRA;
    }
    public double deduction(double basics){
        return 0.12*basics;
    }
    public double bonus(double basics){
        System.out.println("Bonus is not applicable for Manager");
        return 0;
    }
}
class Substaff extends Manager{
    public double bonus(double basics) {
        return 0.5*basics;
    }
}
public class LAB5_3 {
    public static void main(String[] args){
        Substaff substaff=new Substaff();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basics Salary of Employee:");
        double basics = sc.nextInt();
        double earnings=substaff.earning(basics);
        double deduction=substaff.deduction(basics);
        double bonus=substaff.bonus(basics);
        System.out.println("Employee earnings: "+earnings);
        System.out.println("Employee deduction: "+deduction);
        System.out.println("Employee bonus: "+bonus);
    }
}