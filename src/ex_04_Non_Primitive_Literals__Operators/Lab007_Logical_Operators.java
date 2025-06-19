package ex_04_Non_Primitive_Literals__Operators;

public class Lab007_Logical_Operators {
    public static void main(String[] args) {

        boolean a = true;
        System.out.println(!a);

        boolean b = true;
        System.out.println(!!b);

        boolean c = true || false;
        System.out.println(c);



       //   && Logical AND   ->	Returns true if both conditions are true
      //    ||  Logical OR	 -> Returns true if any one condition is true
     //     !	Logical NOT  ->	Reverses the condition

        int m = 10, r = 20;

        // Logical AND
        System.out.println((m > 5) && (r > 15));   // true

        // Logical OR
        System.out.println((m > 15) || (r > 15));  // true

        // Logical NOT
        System.out.println(!(m > r));              // true



    }

}
