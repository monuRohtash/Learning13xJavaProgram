package ex_17_Arrays;

import java.util.Arrays;

public class Lab_004_Array_Priint_loops {
    public static void main(String[] args) {

        int[] age = {600, 44, 55, 100, 20, 500};

        for (int i = 0; i < age.length; i++) {
            Arrays.sort(age);
            System.out.println(age[i]);



        }

    }

}
