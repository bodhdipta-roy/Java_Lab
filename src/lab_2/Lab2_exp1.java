//Write a program to print largest of the 3 numbers entered by the user in command line argument.
package lab_2;
public class Lab2_exp1
{
    public static void main(String[] args)
    {
        if(args.length < 3)
        {
            System.out.println("Please enter three numbers.");
            return;
        }
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);
            int largest = num1;
            if(num2 > largest) {
                largest = num2;
            }
            if(num3 > largest) {
                largest = num3;
            }
            System.out.println("The largest number is " + largest);

    }
}