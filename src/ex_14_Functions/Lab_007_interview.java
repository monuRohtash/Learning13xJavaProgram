package ex_14_Functions;

public class Lab_007_interview {
    public static void main(String[] args) {               // Standard entry point for Java

//        This is the method that the JVM (Java Virtual Machine) will look for when you run the program.
//                The other versions are just overloaded methods, not executed automatically.


//🧠 Summary:
//    You can overload the main method like any other method.
//
//    Only public static void main(String[] args) is run by the JVM.
//
//    Other versions can be called from inside the real main method.

//    You can call them manually inside the main method:
    }



    public static void main(String args) {                          // Overloaded version
        System.out.println("yes");

    }

    public static int main(int args) {                              // Overloaded version
        return 10;

    }

    public static int main(float args) {                           // Overloaded version
        return 2;

    }

    public static boolean main(boolean args) {                     // Overloaded version
        return true;

    }

}
