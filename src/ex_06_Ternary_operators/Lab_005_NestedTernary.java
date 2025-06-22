package ex_06_Ternary_operators;

public class Lab_005_NestedTernary {
    public static void main(String[] args) {

//        Nested Ternary

      //result = condition1 ? expression1 : (expression2 ? expression2 : expression3)




        int age = 25;
         String result = (age < 18) ? "Children  -> is not Eligible "  :  (age <= 24) ?  "Adult-> is Eligible" : "Senior";
        System.out.println(result);







    }
}
