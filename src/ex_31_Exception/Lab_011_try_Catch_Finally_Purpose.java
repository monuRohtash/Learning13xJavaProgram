package ex_31_Exception;

import java.util.Scanner;

public class Lab_011_try_Catch_Finally_Purpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User -> Enter the v");
        int v = sc.nextInt();

        try{
            int b = 10/v;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {

            sc.close();

            System.out.println("I will be always executed! -> End of program  , Sc close ");
        }




    }
}
