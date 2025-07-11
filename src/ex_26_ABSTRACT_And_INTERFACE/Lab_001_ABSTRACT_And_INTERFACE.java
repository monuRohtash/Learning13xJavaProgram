package ex_26_ABSTRACT_And_INTERFACE;

public class Lab_001_ABSTRACT_And_INTERFACE {
    public static void main(String[] args) {




    }
}



abstract class Animal {
    abstract void sound();  // सिर्फ नाम, कोई body नहीं

    void eat() {
        System.out.println("जानवर खाना खाते हैं");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("कुत्ता भौंकता है");
    }
}

