package ex_30_Warraper_Class;

public class Lab_004_Wrapper_Conversion_p2 {
    public static void main(String[] args) {
   String num = "10";
   // String -> Wrapper
        Integer a = Integer.parseInt(num);
        Integer b = Integer.parseInt(num);

        // String -> primitive
        int aa = Integer.parseInt(num);
        System.out.println(aa);


        //Wrapper to String
        int age = 10;
        Integer age_Wrapper = age;
        System.out.println(age_Wrapper.toString());   //"10"




    }
}
