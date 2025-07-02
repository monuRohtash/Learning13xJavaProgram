package ex_17_Arrays;

public class Lab_011_Sum_Of_Array_with_fuunction {
    public static void main(String[] args) {

        int[] Num = {2, 44, 55, 77, 11, 44,};

        int total = findSum(Num);   // Call method and store result
        System.out.println("Total  each element sum : " + total);


    }
    // Method with parameter and return type
    static int findSum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];   // add each element to sum
        }

        return sum;
    }


}

