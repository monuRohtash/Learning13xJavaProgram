package ex_04_Non_Primitive_Literals__Operators;

import java.sql.SQLOutput;

public class Lab011_Equal_Or_And_Gate {
    public static void main(String[] args) {

        // == ? Copmare the value ( primitive)

        System.out.println(10 == 10);     //true
        System.out.println(10 < 10);     //false
        System.out.println(10 <= 10);     // true
        System.out.println(10 > 10);    // false
        System.out.println(10 >= 10);     // true
        System.out.println(10 == 20);     // false
        System.out.println(!(10 > 20));   //true
        System.out.println(!( 20 > 10));  //false
        System.out.println(!( 10 == 10 )); // false

        //  || -> or
        System.out.println("............||.....one condition is true.........");
        System.out.println(true || true);    // true
        System.out.println(false || false);  // false
        System.out.println(false || true);   // true
        System.out.println(true || false);   // true


        System.out.println("............&&......both conditions are true........");
        System.out.println(true && true);    // true
        System.out.println(false && false);  // false
        System.out.println(false && true);   // false
        System.out.println(true && false);   // false










    }
}
