package ex_14_Functions;

//This class provides basic arithmetic operations

import java.util.Scanner;

public class Lab_08_Function_Arth_Interview_Also {
    public static void main(String[] args) {

        /**  Create a Function of Sub, Sum, Mul and Div
         *  with parameter, a, b (take the parameter from the User)
         *
         *   Logic Building
         *  Step 1 -> Inputs and Outputs
         * a, b - int -> Scanner
         *int -> variable result ->
         *
         *Step 2 - Rough logic -> Create functions
         *function -> type 4th - with return and with arguments/parameters
         *
         * Step 3 - Write the code and Find and Fix  -> Edge Cases
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number- 1");

        int a = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            System.out.println("Enter the Int only");
//            return;
            System.exit(0);
        }


        System.out.println("Enter The Number- 1");


        int b = 0;
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        } else {
            System.out.println("Enter the int only");
            return;
        }


        int result_sum = sum(a, b);
        System.out.println("sum of a and b -> " + result_sum);

        int result_mul = mul(a, b);
        System.out.println("mul of a and b  " + result_mul);

        int result_div = div(a, b);
        System.out.println("div of a and b  " + result_div);

        int result_mod = mod(a, b);
        System.out.println("mod of a and b  " + result_mod);

        int result_sub = div(a, b);
        System.out.println("sub of a and b  " + result_sub);

    }


    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */

    static int sum(int a, int b) {
        return a + b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        if (b == 0) {
            System.out.println("B Can't be Zero");
//            throw new ArithmeticException("B Can't be Zero");
            System.exit(0);

        }
        return a / b;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static int sub(int a, int b) {
        return a - b;
    }


}
