package ex_31_Exception;

public class Lab_012_IQ {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;

        try{
            int x = 10/a;
        }catch (Exception e){
            System.out.println("Div by zero");
        }finally {
            System.out.println("i will be executed  finally");
        }

    }
}
