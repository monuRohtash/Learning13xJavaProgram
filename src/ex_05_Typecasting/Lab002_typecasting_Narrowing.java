package ex_05_Typecasting;

public class Lab002_typecasting_Narrowing {
    public static void main(String[] args) {

        int val = 300;
     // byte b = val; // narrowing (int -> byte) - implicit casting is not allowed
        byte b1 = (byte)val; //  narrowing (int -> byte) - Explicit casting is not allowed.
        //DAta Loss
        System.out.println(b1);  // output -> 44

    }
}
