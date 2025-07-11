package ex_24_Opps_Super_And_This_keyword;

public class Lab_002_Super_Key_Example {
    public static void main(String[] args) {


        car c1 = new car(100);
        c1.Display();
    }
}

class Vehicle{
   int maxSpeed = 180;

    Vehicle() {
        System.out.println("Default constructor");
    }

    Vehicle(int a) {
        System.out.println("Parameter constructor");
        System.out.println("Parameter constructor   " +  a);
    }

    //Method overloading - same name , same same, calss, same function with defferenty parameters


    void message() {
        System.out.println("Type - 1 constructor");   // no return and no parameters
    }


    void message(int a) {
        System.out.println("Type - 2 constructor");   // no return and With parameters
    }

    int message(String a) {
        System.out.println("Type- 4 constructor"); //  return and  parameters
        return 0;
    }


    void Display() {
        System.out.println("Vechicle Parent");

    }


}

class car extends Vehicle {
   private int maxSpeed = 300;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    car() {
//        super();                                      //callig parents default


    }

    car(int a) {
        super(10000);                                   //parents parameterized call
    }

    @Override
    void Display() {
        System.out.println(super.maxSpeed);    // This means parente variable call.
        System.out.println(this.maxSpeed);     // This means my Variable call.
        System.out.println("Hi Overrried");
    }
}