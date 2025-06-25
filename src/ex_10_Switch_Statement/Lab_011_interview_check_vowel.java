package ex_10_Switch_Statement;

import java.util.Scanner;

public class Lab_011_interview_check_vowel {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the single Character");

        char ch = scanner.next().toLowerCase().charAt(0);

        switch (ch){

             case 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch +":->  is a vowel ");
             default -> System.out.println(ch +":-> is a consonent");

         }


        scanner.close();
    }



}
