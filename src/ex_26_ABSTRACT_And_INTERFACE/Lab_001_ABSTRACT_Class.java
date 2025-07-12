package ex_26_ABSTRACT_And_INTERFACE;

public class Lab_001_ABSTRACT_Class {
    public static void main(String[] args) {

        bikeRace bike = new bikeRace();
        bike.AllTest();


    }
}


abstract class bike {

    abstract void start1();

    abstract void stop1();

    void break1() {
        System.out.println("Check break in bike");
    }
}

abstract class bikeEngine extends bike {

     abstract void BikeCgarging();


    @Override
    void start1() {
        System.out.println("bike -. start the engine");
    }

    @Override
    void stop1() {
        System.out.println("bike -. stop the engine");
    }



}

class lights extends bikeEngine{
    void bikeLight() {
        System.out.println("Bike Light Is ON");

    }
    @Override
    void BikeCgarging() {
        System.out.println("BikeCharging-  is ON");
    }
}


class bikeRace extends lights{

    void race(){
        System.out.println("Bike-> Race Is Ok");
    }

    void AllTest(){
        start1();
        stop1();
        break1();
        bikeLight();
        BikeCgarging();
        race();

    }
}

