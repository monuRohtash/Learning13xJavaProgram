package ex_19_OOPs;

public class Lab_002_Person {


    // These are called propersties, attributes, instance variable, member variable.
    String name;
    int age;
    String height;
    String gender;
    boolean is_married;

    // These are called as Behaviours, Member Functions, Functions, Methods.


    // 1 function -> no parameter , no return type
    void walk() {
        System.out.println("Walking");
    }
    // 2 function -> Parameter , no return type
    void eat( String food) {
        System.out.println("Eating");
    }

    // 1 function -> no parameter , Return type
    String sleep() {
        System.out.println("Sleeping");
        return null;
    }
    // 1 function ->  Parameter , Return type
    String food(int a) {
        System.out.println("");
        return null;
    }


}
