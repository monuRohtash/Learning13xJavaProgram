package ex_05_Typecasting;

public class Lab003_TypeCasting_Use{
    public static void main(String[] args) {
        long phone = 8053206281l;
//        short s = phone;   //implicit narrow?
        short s1 = (short)phone; //Explicit narrow

        System.out.println(s1);
        //.................................................................

     // Example
        int course = 100;
        float gst = 18.45f;
//        int total = course+gst; // Narrow - Implicit
        int total1 = course+(int)gst;  // Narrow - Explicit
        System.out.println(total1);



        float total2 = course+gst;  // widening - auto - implicit
//        float total3 = (float)course+gst;  // widening - explicit
        System.out.println(total2);
//        System.out.println(total3);





    }
}
