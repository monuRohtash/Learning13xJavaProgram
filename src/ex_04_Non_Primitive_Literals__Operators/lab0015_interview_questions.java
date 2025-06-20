package ex_04_Non_Primitive_Literals__Operators;

public class lab0015_interview_questions {
    public static void main(String[] args) {
        int a = 10;
        boolean b = (10 == 20);   // == ->  Compare Two Value

        System.out.println(a);   // 10
        System.out.println(b);   // false

        //......................................................................

        long l = 101;           // 8 Byts, 64 Bits
        String s = "name";     // 8 Byts, 64 Bits

        //.......................................................................

        char a1 = 'A';  // ASCIT - 65
        char b1 = 'B';   // 66
        System.out.println(a1+b1);  // 131

        //........................................................................


        System.out.println('A' == 65);   // this is true

        System.out.println('B' == 66);    // this is true

        //..........................................................
          short t = 10;
          char c = 'A';    //  A default value is 65 in char
          String  s1  = "A";


        System.out.println(t+c);   // and is 75
        System.out.println(c);      // A  -> alone is a character
        System.out.println(s1);
        System.out.println(c+c);








    }



}
