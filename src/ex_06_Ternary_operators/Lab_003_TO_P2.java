package ex_06_Ternary_operators;

public class Lab_003_TO_P2 {
    public static void main(String[] args) {
        // The max number between two numbers by using ternary operator.
        int x = 10;
        int y = 20;
//        System.out.println(Math.max(x,y));          //  Math.max(x,y)   this is function in java
//        System.out.println(Math.min(x,y));

        int max = x > y ? x : y;
        System.out.println(max);
//....................................................

        int salary = 15000;
        int income = 20000;

        int min = salary < income ? salary : income;
        System.out.println(min);



    }
}
