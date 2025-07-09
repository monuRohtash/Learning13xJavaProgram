package ex_21_OOps_Inheritance;

import java.sql.SQLOutput;

public class Lab_002_Multilevel_Inheritance {
    public static void main(String[] args) {



        // Grandfather object
        grandfather grandf = new grandfather();
        System.out.println(grandf.home);
        grandf.old_maruti();

        System.out.println("..........");


        // Father object
        father_1 f1 = new father_1();
        System.out.println(f1.home);
        f1.old_maruti();
        f1.new_xuv_300();

        System.out.println("..........");

        // Son object
        son_1 s1= new son_1();
        System.out.println(s1.home);
        s1.old_maruti();
        s1.new_xuv_300();
        s1.audiCar();





    }
}

class grandfather {

     String home = "2bhk";

    void old_maruti() {
        System.out.println("Grand Father Have a own Maruti 800 !");
    }
}

class father_1 extends grandfather{

    ////GrandFather Property

//    String home = "2bhk";
//
//    void old_maruti() {
//        System.out.println("Grand Father Have a Old Maruti 800 !");
//    }
//}

void new_xuv_300() {
        System.out.println("Father have a own new_xuv_300 !");
    }
}


class son_1 extends father_1 {

    //// GrandFather Property  also father property

//    String home = "2bhk";
//
//    void old_maruti() {
//        System.out.println("Grand Father Have a Old Maruti 800 !");
//    }
//}
           //// father property
//
//    void new_xuv_300() {
//        System.out.println("Father have a new_xuv_300 !");
//    }
//}

    void audiCar(){
        System.out.println("Son Have a own Audi Car !");

    }



}
