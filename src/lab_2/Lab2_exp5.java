package lab_2;
//Write a Program to find the occurrence of each element in the array.
import  java.util.*;

public class Lab2_exp5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            count=1;
            for(int j=i+1;j<n;j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                    arr[j] = 0;
                }
            }
            if(arr[i]!=0)
                System.out.println("The number "+arr[i]+" occurs "+count+" times.");
        }
    }
}
