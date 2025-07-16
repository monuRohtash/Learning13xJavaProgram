package ex_32_Generics;

public class Lab_001_Generics {


//        🔹 Definition:
//        Generics allow you to write code that works with any data type, while still maintaining type safety.
//
//         📌  In simple words:
//        "Write code once, use with many data types."
public static void main(String[] args) {

        display(2,5);
        display(3.33, 4.44);
        display("Monu", "Raghav");
        display(806430872, 678876556);

    }

    static  <T> void display(T a, T b){
        System.out.print(a);
        System.out.println(b);

    }
}
