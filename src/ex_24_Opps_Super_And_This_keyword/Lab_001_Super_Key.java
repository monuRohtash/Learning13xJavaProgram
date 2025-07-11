package ex_24_Opps_Super_And_This_keyword;

public class Lab_001_Super_Key {
    public static void main(String[] args) {




        Dog d1 = new Dog();
        d1.displayColor();
        d1.makeSound();
        d1.Makeeating();


    }
}

class Animal{

    String color = "Brown_Animal";

    Animal(){
        System.out.println("Animal constructor(Parent class)Called");
    }
    void sound(){
        System.out.println("Animal makes sound (Parent calss)");
    }

    void eating(){
        System.out.println("Animal Eating ");
    }
}



class Dog extends Animal {
    String color = "Black";

    Dog() {
        System.out.println("Dog  constructor (child class) Called");
    }



    void displayColor() {
          System.out.println("Dog color using this: " + this.color);   // refers to Dog's color
          System.out.println("Animal color using super: " + super.color); // refers to Animal's color
      }

      void makeSound(){
        super.sound();


      }
    void eating(){
        System.out.println("Dog Eating ");
    }

    void Makeeating(){
        this.eating();
        super.eating();

    }

    }






