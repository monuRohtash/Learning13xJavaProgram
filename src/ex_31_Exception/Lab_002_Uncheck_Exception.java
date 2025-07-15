package ex_31_Exception;

public class Lab_002_Uncheck_Exception {
    public static void main(String[] args) {

        System.out.println("Starting the program !");
        String input_user = args[0];          //java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0

        Integer a = Integer.parseInt(input_user);    //java.lang.NumberFormatException
        Integer output = 100 / a;            //java.lang.ArithmeticException: / by zero
        System.out.println(output);
        System.out.println("End of the program");


        //divide by zero ->?

        //    java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        //    java.lang.NumberFormatException -> for input string "Monu"
        //    //java.lang.ArithmeticException: / by zero when args 0



    }
}
