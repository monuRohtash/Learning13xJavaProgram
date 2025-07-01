package ex_017_Arrays;

public class Lab_007_Array_MaxValueWithMethod {
    public static void main(String[] args) {


        int[] array = {22, 44, 66, 77, 88, 25, 98, 65};



        int maxValue = findMax(array);
        System.out.println("Maximum value in the array is: " + maxValue);
    }

    // Method with parameter and return type

    static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }


}
