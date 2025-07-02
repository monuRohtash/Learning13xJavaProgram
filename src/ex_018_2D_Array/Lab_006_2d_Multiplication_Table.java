package ex_018_2D_Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_006_2d_Multiplication_Table {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Value");
        int multi = scanner.nextInt();

        for (int i = 0; i < multi; i++) {
            for (int j = 0; j < multi; j++){

                System.out.print(i*j + " | ");
            }
            System.out.println();
        }




    }


}
