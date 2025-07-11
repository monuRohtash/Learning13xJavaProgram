package ex_26_ABSTRACT_And_INTERFACE;

public class Lab_002_ABSTRACT_Cars {
    public static void main(String[] args) {


        Wagnor car = new Wagnor();
        car.drive();
    }
}

abstract class Engine {
    abstract void startEngine();

    abstract void stopEngine();

    void checkEngine() {
        System.out.println("Everything is good !");
    }
}

class Wagnor extends Engine {

    @Override
    void startEngine() {
        System.out.println("Starting the car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stoping the car");
    }

    void drive() {
        checkEngine();
        startEngine();
        stopEngine();

    }
}