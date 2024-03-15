package lab_7;

import java.util.Scanner;

public class LAB7_1 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            for (int i = 0; i < 6; i++) {
                arr[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}

