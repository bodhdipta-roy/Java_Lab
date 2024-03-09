package lab_2;
//Write a Program to find the sum of elements of both the diagonals of a 3x3 matrix.
import  java.util.*;
public class Lab2_exp6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum1=0,sum2=0;
        for(int i=0;i<3;i++){
            sum1+=arr[i][i];
            sum2+=arr[i][2-i];
        }
        System.out.println("The sum of the first diagonal is "+sum1);
        System.out.println("The sum of the second diagonal is "+sum2);
    }
}