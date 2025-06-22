package ex_06_Ternary_operators;

import java.beans.PropertyEditorSupport;

public class Task_2 {
    public static void main(String[] args) {

//        Program 2: Check Even or Odd.
//
//        Description: Uses ternary to check whether a number is even or odd. A = 19, update the a value and check again A =20;

        int A = 19;

        String  even = (A%2 == 0) ? "Even" : "Odd";
        System.out.println("A = " + A + " is " + even);


        //Update the value Check Again
        int B = 20;

        String odd = (B%2 == 0) ?  "Even" : "Odd";
        System.out.println("B = " + B + " is " + odd);






    }
}
