package ex_09_if_condation;

import java.util.Scanner;

public class Lab_002_If_else_Condation {
    public static void main(String[] args) {
        System.out.println("enter age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age < 22 ){
            System.out.println(" not allow to vote");
        } else {
            System.out.println("allow to vote");

        }


    }



}
