package ex_15_String;

public class Lab_003_String_Immu {
    public static void main(String[] args) {

         String s1 = " Monu";
         s1.concat("Raghav");
          System.out.println(s1);

          // Then

        String a1 = "Hello";

        a1 = a1.concat("World");  //Concat . basically add the value or merge the value in the end.
        System.out.println(a1);


    }
}
