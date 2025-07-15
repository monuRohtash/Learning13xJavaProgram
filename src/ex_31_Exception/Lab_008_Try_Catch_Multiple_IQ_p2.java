package ex_31_Exception;

import javax.lang.model.type.ArrayType;

public class Lab_008_Try_Catch_Multiple_IQ_p2 {
    public static void main(String[] args) {

    // refer this code sr. QA
 try{
     String input_user = args[0];
     int a = Integer.parseInt(input_user);
     int output = 100/a;
 }catch (ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e){
     System.out.println(e.getMessage());
     System.out.println("All exception");
 }

        System.out.println("END");

    }
}
