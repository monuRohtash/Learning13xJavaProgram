package ex_31_Exception;

public class Lab_007_Try_Catch_Multiple_IQ {
    public static void main(String[] args) {

//        String s1 = null;
//
//        try{
//            s1.trim();
//        }catch (NullPointerException e){
//            System.out.println("Null Error");
//        }
//
//       try{
//           int i = 10/0;
//       }catch (ArithmeticException e){
//           System.out.println("ArithmeticException ");
//       }
//        System.out.println("End");


//        Combind the try catch code long to short

        String s1 = null;

        try{
            s1.trim();
            int i = 10/0;
        }catch (NullPointerException | ArithmeticException e){
            System.out.println("NullPointerException Error , ArithmeticException ");
        }catch (Exception e){
            System.out.println("YES");
        }


        System.out.println("End");



    }
}
