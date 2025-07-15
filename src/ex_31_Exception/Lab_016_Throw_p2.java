package ex_31_Exception;

public class Lab_016_Throw_p2 {
    public static void main(String[] args) {

        int a = 0;

        if (a == 0) {
            throw  new ArithmeticException("Error a == 0");
        }
    }
}
