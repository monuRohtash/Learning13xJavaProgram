package ex_04_Non_Primitive_Literals__Operators;

import java.sql.SQLOutput;

public class Lab010_Bodmas {

    public static void main(String[] args) {


        // BODMAS -> Bracket of div, mul, add, sub
        System.out.println((9 * 3 / 9 + 1 ) * 3 );
        // 9*3 = 27
        // 27/9 = 3
        // 3+1  = 4
        // 4*3  = 12
    }
}
