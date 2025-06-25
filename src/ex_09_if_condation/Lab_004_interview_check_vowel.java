package ex_09_if_condation;

import java.util.Scanner;

public class Lab_004_interview_check_vowel {

    public static void main(String[] args) {

        // How to check  if a character is a vowel in java


        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese enter the single character");
        char ch = scanner.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u'){

            System.out.println( ch + " is a vovel!");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a consonent");
        } else {
            System.out.println("  Invalid char!");
        }
    }

}
