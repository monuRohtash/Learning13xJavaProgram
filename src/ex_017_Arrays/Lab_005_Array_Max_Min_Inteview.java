package ex_017_Arrays;

import java.util.Arrays;

public class Lab_005_Array_Max_Min_Inteview {
    public static void main(String[] args) {

        int[] array = {99, 33, 77, 11, 33, 55, 24, 72, 85};
//        Arrays.sort(array);
//        System.out.println(array[array.length-1]);   //This is not Correct Way

        int max = array[0];                        // assume first element is the max

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max  = array[i];                  // update max if current element is greater

            }
        }
        System.out.println("Maximum value in array is: " + max);

    }
}
