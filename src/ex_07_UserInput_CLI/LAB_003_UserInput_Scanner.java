package ex_07_UserInput_CLI;

import java.util.Scanner;

public class LAB_003_UserInput_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Age ");

        int age = scanner.nextInt();
        String CanIvote = age >=18 ? "Yes" : "No";
        System.out.println(CanIvote);



    }

}
