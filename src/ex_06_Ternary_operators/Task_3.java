package ex_06_Ternary_operators;

public class Task_3 {
    public static void main(String[] args) {
//        Program 3: Grade Calculation Using Nested Ternary
//
//        Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.

        int marks = 75;

        String Grade = (marks >= 90) ? "A+" :
                       (marks >= 75) ? "A" :
                       (marks >= 60) ? "B" :
                       (marks >= 40) ? "C" : "Fail";

        System.out.println("Marks = " +  marks + ", Grade=  " + Grade);
    }
}
