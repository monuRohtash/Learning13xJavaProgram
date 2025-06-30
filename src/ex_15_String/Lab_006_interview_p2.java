package ex_15_String;

public class Lab_006_interview_p2 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";       // This is a 1 String
        String s3 = "Hello";

        String s5 = new String("Hello");
        String s6 = new String("Hello");       //This is a 3 string
        String s7 = new String("hello");

        // SCP  | Object Area | Total String
        //  1   |       3   ->       4

        // == -> Comparsion -> String -> this check the location ref.
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s2 == s5);

        System.out.println(s1 == s2);
        System.out.println(s5 == s6);


        //equals  (  content )  -> value

        System.out.println(s1.equals(s5));
        System.out.println(s6.equals(s7));               // this line  check equal content
        System.out.println(s6.equalsIgnoreCase(s7));

        //equalsIgnoewCase -> raghav. Raghav, Raghav , raghav. RaghaV -> raghav
        // == check for the ref
        // = assignment the value






    }
}
