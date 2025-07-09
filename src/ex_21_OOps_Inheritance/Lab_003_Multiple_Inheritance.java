package ex_21_OOps_Inheritance;

public class Lab_003_Multiple_Inheritance {

    public static void main(String[] args) {

//        4. Multiple Inheritance with Class (Not allowed directly):

        /**
          class A { }
          class B { }
          class C extends A, B { } // ❌ Not allowed
         */



        /**
         ✅ But it is allowed with interfaces:

         interface A {
         void show();
         }

         interface B {
         void display();
         }

         class C implements A, B {
         public void show() {
         System.out.println("Show A");
         }

         public void display() {
         System.out.println("Display B");
         }
         }




         */


    }


}
