package ex_09_if_condation;

import java.util.Scanner;

public class Lab_001_If_Condation {

    public static void main(String[] args) {


        System.out.println("Enter the Age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 18){
            System.out.println("eligible");
        }

    }
}
