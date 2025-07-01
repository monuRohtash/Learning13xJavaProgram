package ex_17_Arrays;

public class Lab_006_Array_Min_Inteview {
    public static void main(String[] args) {

        int[] array = {99, 33, 77, 11, 33, 55, 24, 72, 85};

        int min = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }

        System.out.println("Minimum value in array is: " + min);
    }
}
