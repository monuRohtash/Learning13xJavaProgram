package ex_017_Arrays;

import java.util.Arrays;

public class Lab_011_Interview_2nd_High_Number_Array {
    public static void main(String[] args) {
        // find second largest number in an array

        int[] num = {12, 33, 10, 55, 1, 100, 3, 4 };


        Arrays.sort(num);
        System.out.println(num[num.length- 2]);
        // You find it without using the sort function


    }
}
