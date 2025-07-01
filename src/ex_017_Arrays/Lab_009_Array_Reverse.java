package ex_017_Arrays;

public class Lab_009_Array_Reverse {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6 };

        for (int i = num.length - 1; i >= 0; i--){      // Array Reverse
            System.out.println(num[i]);
        }

    }
}
