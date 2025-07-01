package ex_017_Arrays;

import java.util.Arrays;

public class Lab_003_Array_p2 {
    public static void main(String[] args) {


      String[] name = {"monu" , "raghav", "rohtash"};

        System.out.println(name.length);
        System.out.println(Arrays.stream(name).count());
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);


        boolean[]  b = {true, false, true};

//        System.out.println(b.length);
//        System.out.println(b[0]);
//        System.out.println(b[1]);
//

        for (int i = 0; i < b.length; i++) {
            System.out.println("boolean value  ;   " + i);

        }




        boolean[] b2 = new boolean[3];
        b2[0] = false;
        b2[1] = true;
        b2[2] = false;
        System.out.println(b2.length);
        System.out.println(b2[0]);
        System.out.println(b2[1]);
        System.out.println(b2[2]);




    }

}
