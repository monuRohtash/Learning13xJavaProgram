package ex_05_Typecasting;

public class Lab001_Typecasting {
    public static void main(String[] args) {

//        byte b = 10;
//        int a = b;   // widening -> implicit casting
//        System.out.println(a);

        //..................................

        byte b = 20;
        int i = b;            // widening -> implicit casting
        int i1 = (int)b;       // widening -> Explicit casting  // jvm says that in case of widening that is  no need this

        System.out.println(i1);


    }
}
