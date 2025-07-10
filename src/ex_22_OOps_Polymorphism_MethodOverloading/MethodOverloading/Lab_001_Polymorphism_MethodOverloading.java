package ex_22_OOps_Polymorphism_MethodOverloading.MethodOverloading;

public class Lab_001_Polymorphism_MethodOverloading {
    public static void main(String[] args) {

        /*
         * ✅ Polymorphism in Java (OOPs Concept)
         * Polymorphism means "many forms". It allows one interface to be used for a general class of actions.
         * The actual action is determined by the exact nature of the situation.

         🔹 Types of Polymorphism in Java
         Java supports two types of polymorphism:

         Type	Description	Example
         Compile-Time (Static)  ->	Method overloading ->	Same method name, different args
         Run-Time (Dynamic)     ->	Method overriding  ->   Parent-child class relationship

         ✅ Benefits of Polymorphism
          1. Code reusability
          2. Flexibility and scalability
          3. Easy to maintain and extend
         */

        MathOperations m1 = new MathOperations();
        int r1 = m1.add(3, 4);
        System.out.println(r1);

        int r2 = m1.add(4,5,7);
        System.out.println(r2);

        double r3 = m1.add(5.14,7.76);
        System.out.println(r3);

        String r4 = m1.add("monu", "raghav");
        System.out.println(r4);


    }
}

class MathOperations{
    // in the same class, when you have a method with same
    // same name method but different arguments and different return type.

    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

    String add(String a, String b){
        return a+b;
    }








}
