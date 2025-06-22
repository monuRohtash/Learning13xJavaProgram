package ex_06_Ternary_operators;

public class Task_1 {
    public static void main(String[] args) {

//        Program 1: Find Max of Two Numbers using Ternary Operators.
//
//        Description: Uses ternary operator to compare a and b and print the
//        maximum value.A =10, B= 20;


        int A =10;
        int B = 20;

        //1-> solved to 1st options
        System.out.println(Math.max(A, B));

        //1-> solved to 2nd options
        int result = A > B ? A : B;
        System.out.println(result);







    }
}
