package ex_22_OOps_Polymorphism_MethodOverloading.MethodOverriding;

public class LAb_001_Override {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.sound();



        Dog d2 = new Dog();

        d2.OverLoading();
        d2.OverLoading(2, 7);



    }
}


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
        System.out.println("Override ->same name 2 different classes");
    }

    void OverLoading() {
        System.out.println("OverLoading -< same class in same name with diff parameters");
    }

    void OverLoading(int a, int b) {
        System.out.println("OverLoading -< same class in same name with diff parameters");
    }

}
