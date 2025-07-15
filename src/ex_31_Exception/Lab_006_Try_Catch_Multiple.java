package ex_31_Exception;

public class Lab_006_Try_Catch_Multiple {
    public static void main(String[] args) {
        System.out.println("1");

        try{
            int a = 10/0;
        }catch (ArithmeticException e){                   // Small basket class
            System.out.println("Are u fool !");
        }catch (Exception e){                              // Big basket clas
            System.out.println("Are u fool too!");
        }
        System.out.println("2");
    }
}
