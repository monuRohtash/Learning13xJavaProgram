package ex_04_Non_Primitive_Literals__Operators;

public class lab0012_interview_questions {
    public static void main(String[] args) {

    int salary = 12;
     boolean b = !(salary > 10 || salary < 5);
        System.out.println(b);

        // Explain
        // (12 > 10)  // true
        // (12 < 5)   //   false

//    !(true || false) ->  false

        int wages = 15;
        boolean  w = !(wages > 9  && wages < 6);

        System.out.println(w);

        // Explain
        //  15 > 9 && 15 < 6
        //






    }

}
