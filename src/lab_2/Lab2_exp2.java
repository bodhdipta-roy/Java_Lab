package lab_2;
//Write a program to accept 10 numbers and check how many are even and how many are odd

public class Lab2_exp2
{
    public static void main(String[] args)
    {
        int evenCount = 0;
        int oddCount = 0;
            for(int i = 0; i < 10; i++)
            {
                int num = Integer.parseInt(args[i]);
                if(num % 2 == 0)
                    evenCount++;
                else
                    oddCount++;
            }
            System.out.println("Number of even numbers: " + evenCount);
            System.out.println("Number of odd numbers: " + oddCount);
    }
}
