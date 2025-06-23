package ex_10_Switch_Statement;

import java.util.Scanner;

public class Lab_008_Jdk_13_multiple_match {
    public static void main(String[] args) {


//        System.out.println("enter the valid code");
//        Scanner scanner = new Scanner(System.in);
//        int itemCode = scanner.nextInt();

        int itemCode = 001;

        // Arrow function  no need of break keyword only one line suported
        switch (itemCode) {

            case 001, 002, 003:
                System.out.println("all of the them are electronic  Gadget");
                break;
            case 004, 005, 006:
                System.out.println(" This Is Doremon Gadget");
                break;
            default:
                System.out.println("none");



        }

    }


}
