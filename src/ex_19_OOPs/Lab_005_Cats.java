package ex_19_OOPs;

public class Lab_005_Cats {

    public static void main(String[] args) {

        Cat c1 = new Cat();

        c1.Running();
        c1.eat();
        c1.bark();


    }
}

class Cat {

    Cat() {
        System.out.println("CAt");
    }

    void Running() {
        System.out.println("Cat is Running - 1");
    }

    void eat() {
        System.out.println("Cat is eating - 2");
    }

    void bark() {
        System.out.println("Cat is bark - 3");
    }


}