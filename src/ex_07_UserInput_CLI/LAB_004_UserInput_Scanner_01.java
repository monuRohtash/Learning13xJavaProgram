package ex_07_UserInput_CLI;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LAB_004_UserInput_Scanner_01 {
    public static void main(String[] args) {

        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s);

        System.out.println("Enter the int age");
        int i = scanner.nextInt();
        System.out.println(i);

        System.out.println("Enter the Double college marks");
        double d = scanner.nextDouble();
        System.out.println(d);






    }
}
