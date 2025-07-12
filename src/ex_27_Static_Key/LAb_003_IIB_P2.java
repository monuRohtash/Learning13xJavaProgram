package ex_27_Static_Key;

public class LAb_003_IIB_P2 {

    public static void main(String[] args) {


        new car1();
    }

}



class car1 {
    car1() {
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