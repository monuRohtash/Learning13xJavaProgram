package ex_21_OOps_Inheritance;

import org.w3c.dom.ls.LSOutput;

public class Lab_001_Inheritance {
    public static void main(String[] args) {


        father f1 = new father();

        System.out.println(f1.gold_f);
        f1.bhk2();

        System.out.println();

        son s1 = new son();

        System.out.println("fater ki property  son ke pass h ");
        System.out.println(s1.gold_f);

        s1.bhk3();
        s1.bhk2();

    }
}

class father {
    int gold_f = 1000;         //Attribute | Data Variables | Property | Instance Variables

    void bhk2() {        // Behaviour | Method | Function | Data Members
        System.out.println("Father -> 2BHK Flat");

    }
}

class son extends father {

//     int gold_f = 1000;         //Attribute | Data Variables | Property | Instance Variables
//     void bhk2(){        // Behaviour | Method | Function | Data Members
//         System.out.println("Father -> 2BHK Flat");
//
//     }


    void bhk3() {


        System.out.println("Son -> 3BHK FLat");

    }

}
