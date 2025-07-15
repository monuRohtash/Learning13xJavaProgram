package ex_31_Exception;

public class Lab_009_IQ {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;

        try {
            b = 10/c;             // Vulnerable code that shoild be try and catch!
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("ArithmeticException");
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Exception");
        }


    }
}
