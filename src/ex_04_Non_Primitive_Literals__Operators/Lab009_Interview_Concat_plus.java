package ex_04_Non_Primitive_Literals__Operators;

public class Lab009_Interview_Concat_plus {
    public static void main(String[] args) {

        String first_name = "Monu";
        String last_name  = "Raghav";

        int a = 10;
        int b = 10;

        System.out.println(a+b);

        System.out.println(first_name + last_name + a+b);

        System.out.println(a+b + first_name+last_name);

        System.out.println(first_name + last_name + (a+b));

        // BODMAS -> Bracket of div, mul, add, sub

}

}
