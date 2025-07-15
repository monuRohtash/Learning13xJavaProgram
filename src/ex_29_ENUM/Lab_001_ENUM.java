package ex_29_ENUM;

public class Lab_001_ENUM {
    public static void main(String[] args) {
//        ✅ What is enum in Java? (Easy Explanation)
//        enum (short for enumeration) is a special data type in Java used to define a fixed set of constants.
//
//🔸 Why use enum?
//        Instead of using strings or numbers to represent fixed options (like days, colors, status), enum gives you:
//        Type safety
//        Code clarity
//        Compile-time checking

        System.out.println(Day.FRIDAY);
        System.out.println(Project_Name.Api) ;




    }

}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum Project_Name{
    saral, Api, Postman, java
}


//class  A{
//    String[] days = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
//}