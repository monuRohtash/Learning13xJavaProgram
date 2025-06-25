package ex_13_Do_While_loop;

public class Lab_002_Diff_While_DoWhile_loop {
    public static void main(String[] args) {

        int a =0;

//        while (a < 0){               // condition is checked first, then the body is execute
//            System.out.println("This is a while loop " + a);
//            a++;
//        }


        //Diff b/w both of them

        do {                     //   Body is executed first, then the condition is checked.
                                //    is should be run 1  time
            System.out.println("This is a do-while loop " + a);
            a++;
        }while (a < 0);










    }
}
