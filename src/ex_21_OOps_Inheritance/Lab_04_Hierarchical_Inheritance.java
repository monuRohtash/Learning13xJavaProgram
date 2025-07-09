package ex_21_OOps_Inheritance;

public class Lab_04_Hierarchical_Inheritance {

    public static void main(String[] args) {


        sonu_son_1 son1 = new sonu_son_1();
        son1.Network_Engineer();
        son1.Home();
        son1.Car();

        System.out.println();

        monu_son_2 son2 = new monu_son_2();
        son2.Software_Engineer();
        son2.Car();
        son2.Home();

        System.out.println();

        vikky_son_3 son3 =  new vikky_son_3();
        son3.Accountent();
        son3.Car();
        son3.Home();
    }
}

class father_Dad {
    void Home() {
        System.out.println("father have a home");
    }
    void Car() {
        System.out.println("father have a car");
    }
}

class sonu_son_1 extends father_Dad {

    void Network_Engineer() {
        System.out.println("sonu ->  Network_Engineer");
    }
}

class monu_son_2 extends father_Dad {

    void Software_Engineer() {
        System.out.println("Monu ->  Software_Engineer");
    }
}

class vikky_son_3 extends father_Dad {

    void Accountent() {
        System.out.println("Vikky ->  Accountent");
    }
}

