package ex_27_Static_Key;

public class Lab_002_IIB {

    public static void main(String[] args) {

//   🔹 IIB = Instance Initialization Block
//      It is a block of code that runs every time an object is created, before the constructor.
//      i will be executed when object is created.

//        static → Belongs to class (shared, no object needed)
//        IIB → Runs before constructor (object-related logic)




        car c1 = new car();
        car c2 = new car();
    }


}


class car {
    car() {
        System.out.println("Default Constructor - Runs after IIB");
    }

    {
        System.out.println("IIB Block - Runs before constructor");
        System.out.println("IIB Block - ");

        // mysql connection
        //read a csv, xlsx, file
        //read json, xml.
        //read a text file or env file
    }
    // multiple IIB is allowed

    {
        System.out.println("IIB Block - Runs before constructor");

    }
    {
        System.out.println("IIB Block - Runs before constructor");

    }
    {
        System.out.println("IIB Block - Runs before constructor");

    }

    static {
        System.out.println("static block will bw execute first and one time ");
    }


}