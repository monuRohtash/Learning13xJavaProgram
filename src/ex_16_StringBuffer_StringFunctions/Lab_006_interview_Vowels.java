package ex_16_StringBuffer_StringFunctions;

import java.util.Scanner;

public class Lab_006_interview_Vowels {
    public static void main(String[] args) {

        // java program to count vowel and consonants

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string ");
        String input = scanner.nextLine().toLowerCase();

        int vowel = 0 , consonents = 0;

        for (int i = 0; i <input.length(); i++) {
            char ch = input.charAt(i);

        // Check for vowels
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            vowel++;
        }else {
            consonents++;
        }

        }

        System.out.println("vowels " + vowel);
        System.out.println("Consonent :" + consonents);






    }
}