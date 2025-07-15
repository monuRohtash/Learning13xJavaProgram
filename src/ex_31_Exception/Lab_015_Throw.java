package ex_31_Exception;

import java.util.Scanner;

public class Lab_015_Throw {
    public static void main(String[] args) {
        // 🧠 Real-life Analogy:
        //    throws = Main keh raha hoon – complain meri taraf se ho sakti hai, aage handle karo

        //    throw = Main khud complain karta hoon

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age ");
        int age = sc.nextInt();


//        int age = 15;

        if (age < 18) {
            //Manully throe an exception
            throw new ArithmeticException("not eligible for voting");

        }
        System.out.println("you can vote !");

    }
}
