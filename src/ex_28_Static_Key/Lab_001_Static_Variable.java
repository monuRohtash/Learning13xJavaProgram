package ex_28_Static_Key;

public class Lab_001_Static_Variable {
    public static void main(String[] args) {


        System.out.println(static_Var.a);
//        System.out.println(ststic_Var.b);            //this is not accessable because not a ststic variable

        static_Var var = new static_Var();
        System.out.println(var.b);

        System.out.println(static_Var.name);

        static_Var.show();
    }

}


class static_Var {
    static int a = 10;       // static variable
    int b = 20;               //this is not accessable because not a ststic variable
    static String name = "Monu";         // static variable

    // Ststic Block is a which is automatically called whenever a class os loaded
   //  Belongs to class (shared, no object needed)

    static {
        // This Is Static Bock
        // This IS Called whenever a class a loaded
        System.out.println("Static Block Runs First! without any object");
    }



    static void show(){               // static method
        System.out.println("This is a static method");
    }


}
