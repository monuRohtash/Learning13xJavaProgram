package ex_14_Functions;

import java.sql.SQLOutput;

public class Lab_005_User_Defined_P1 {


//|            Type                                                    | Description                     | Example          |
//   | ------------------------------------------------------ | ------------------------------- | ------------------------- |
//   | 1. without parameters, without return type | Just performs a task            | `void greet()`            |
//   | 2. with parameters, without return type    | Takes input but returns nothing | `void greet(String name)` |
//   | 3. without parameters, return type    | Returns a value without input   | `int getNumber()`         |
//   | 4. with parameters, return type      | Takes input and returns value   | `int add(int a, int b)`   |
//
//

    public static void main(String[] args) {
//        1. Function without parameters**, without return type**
        WP_wR_greet();


//        3. Function without❌ parameters , ✅ return type
        String msg = greet_with_hello_Wp_With_RT();
        {
            System.out.println(msg);
        }


//       2. with parameters, Without return type (90%)
        greet_with_details("Raghav", 28, 1000);
        greet_with_details("monu", 21, 1020);
        greet_with_details("kapil", 22, 1500);
        greet_with_details("Deepak", 26, 1800);


//      4. with **parameters, return type
        int sum = Sum_of_two_numbers(2, 7);
        int sum2 = Sum_of_two_numbers(21, 72);
        int sum3 = Sum_of_two_numbers(72, 57);
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);




        int result = Math.max(3,4);
        System.out.println(result);

    }









//     1. Function without ❌ parameters, ❌without return type**
    static void WP_wR_greet(){
        System.out.println(" 1. Function without parameters**, without return type**");

    }

//     2. with parameters, Without return type (90%)

    static void greet_with_details(String name, int age, double salary){

        System.out.println("Your Name-> " + name + "Your age-> "  +age +  "Your Salary-> "  +salary );
    }


//     3. without❌ parameters , ✅ return type

     static String greet_with_hello_Wp_With_RT(){
         System.out.println("3. without❌ parameters , ✅ return type");
         System.out.println("Wp_with_RT");
         return "Hi, How Are You";

     };

//     4. with **parameters, return type

    static int Sum_of_two_numbers(int a, int b){
          return a+b;
}




}
