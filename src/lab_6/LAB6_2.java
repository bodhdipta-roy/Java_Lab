package lab_6;

import java.util.Scanner;

public class LAB6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);

        // i) Change the case of the string
        System.out.println("Case changed string: " + changeCase(str1));

        // ii) Reverse the string
        System.out.println("Reversed string: " + new StringBuilder(str1).reverse().toString());

        // iii) Compare two strings
        System.out.println("Comparison result: " + str1.compareTo(str2));

        // iv) Insert one string into another string
        System.out.println("String after insertion: " + str1.substring(0, str1.length() / 2) + str2 + str1.substring(str1.length() / 2));

        // v) Convert the string to upper case and lower case
        System.out.println("Upper case: " + str1.toUpperCase());
        System.out.println("Lower case: " + str1.toLowerCase());

        // vi) Check whether the character is present in the string and at which position
        int index = str1.indexOf(ch);
        if (index != -1) {
            System.out.println("Character found at position: " + (index + 1));
        } else {
            System.out.println("Character not found in the string.");
        }

        // vii) Check whether the string is palindrome or not
        String reversedStr1 = new StringBuilder(str1).reverse().toString();
        if (str1.equals(reversedStr1)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // viii) Check the number of word, vowel and consonant in the string
        int wordCount = str1.split("\\s+").length;
        int vowelCount = str1.replaceAll("[^aeiouAEIOU]", "").length();
        int consonantCount = str1.replaceAll("\\s|[aeiouAEIOU]", "").length();
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    private static String changeCase(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.setCharAt(i, Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
}