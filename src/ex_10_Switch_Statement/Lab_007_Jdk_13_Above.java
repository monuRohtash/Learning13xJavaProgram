package ex_10_Switch_Statement;

public class Lab_007_Jdk_13_Above {
    public static void main(String[] args) {

     int itemCode = 001;

     // Arrow function  no need of break keyword only one line suported
     switch (itemCode){

         case 001 -> System.out.println("001");
         case 002 -> System.out.println("002");
         case 003 -> System.out.println("003");
         default -> System.out.println("Default");
     }


    }


}

