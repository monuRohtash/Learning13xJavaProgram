package ex_31_Exception;

public class Lab_005_Handle_Exception {
    public static void main(String[] args) {
        int a = 0;
//         a = 10/0;
//        System.out.println(a);


        try {
            a = 10 / 5;
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage() );
            System.out.println("div by zero not allowed" );
        }
        System.out.println(a);
    }
}
