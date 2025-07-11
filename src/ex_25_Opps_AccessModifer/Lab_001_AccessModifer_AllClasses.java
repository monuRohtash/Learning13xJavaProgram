package ex_25_Opps_AccessModifer;

public class Lab_001_AccessModifer_AllClasses {



}


//        In Java, access modifiers control the visibility of classes, methods, and variables.
//        There are four main access modifiers:

//        | Modifier    | Same Class  | Same Package   | Other Packages   |
//        | ----------- | ----------  | ------------  | --------------------  | --------------  |
//        | `private`   | ✅          | ❌            | ❌                    | ❌              |
//        | *default*   | ✅          | ✅            | ❌                    | ❌              |
//        | `protected` | ✅          | ✅            | ✅                    | ❌              |
//        | `public`    | ✅          | ✅            | ✅                    | ✅              |





class Father{

    private int gold = 100;
    int  car = 1;
    public int Bhk3 = 5;

}

class son extends Father{

      void WeCanUse(){

//          System.out.println(gold);       //Its Private Class only for use  Same Class
          System.out.println(car);          //Its default class ony for use  Same Class  | Same Package
          System.out.println(Bhk3);        //Its public Class use for everyone
                                         // Its Protector class only use for Same Class | Same Package | Other Packages


      }



}