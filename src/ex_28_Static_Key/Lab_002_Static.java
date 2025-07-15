package ex_28_Static_Key;

public class Lab_002_Static {


}

class B{

     static {
         System.out.println("SIB, called once , class is loaded");
     }

     int a = 10;
     static int b = 10;


     void display(){
         System.out.println(b);
         System.out.println("Non static f(n)");
     }

     static void commonToAll(){
//         System.out.println(a);         Non static not access
         System.out.println("Static f(n )");
     }

     static class c{
         // not use in automation

     }

}