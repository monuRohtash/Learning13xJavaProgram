package ex_02_Variables_and_Data_Types;

public class Lab010_printF {

    public static void main(String[] args) {
         //println() VS print() VS printF

        int i = 10;
        System.out.print("print without the new line");

        System.out.println(" new line added");
        System.out.println("Add new line in tha codes");

        System.out.println(i);
        System.out.printf("your variable name is %d", i);
        //prntf-> format the output



                //%d -> int .byte, long, short, - data type
                //%s -> string
                //%f -> float, double,
                //%b -> boolean

        int a = 5;


        System.out.println("Table of 9:");
        System.out.printf("%d x 1 = %d\n", a, a * 1);
        System.out.printf("%d x 2 = %d\n", a, a * 2);
        System.out.printf("%d x 3 = %d\n", a, a * 3);
        System.out.printf("%d x 4 = %d\n", a, a * 4);
        System.out.printf("%d x 5 = %d\n", a, a * 5);
        System.out.printf("%d x 6 = %d\n", a, a * 6);
        System.out.printf("%d x 7 = %d\n", a, a * 7);
        System.out.printf("%d x 8 = %d\n", a, a * 8);
        System.out.printf("%d x 9 = %d\n", a, a * 9);
        System.out.printf("%d x 10 = %d\n", a, a * 10);




    }   
    
    
}
