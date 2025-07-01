package ex_15_String;

import java.util.Scanner;

public class Lab_009_Interview_QA {
    public static void main(String[] args) {
        //palindrome
        // madam -> reverse(madam) -> madam ==
        // s1 = madam
        // s1_reverse = madam
        // s1 == s1_reverse
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a String Value: ");
        String s1 = sc.nextLine();

        String s1_reverse = ""; // To Store Reversed String

        //Reverse the string manually using a loop
        for (int i = s1.length() - 1; i >= 0; i--) {
            s1_reverse += s1.charAt(i);

        }

        //Check if original and reversed are equal
         if (s1.equals(s1_reverse)) {
             System.out.println("is a Palindrome");
         }else {
             System.out.println("is Not a Palindrome");
         }


    }}

