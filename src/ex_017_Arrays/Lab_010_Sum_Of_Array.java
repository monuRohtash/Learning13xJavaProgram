package ex_017_Arrays;

public class Lab_010_Sum_Of_Array {
    public static void main(String[] args) {
        int[] Num = {2, 44, 55, 77, 11, 44,};

        int sum = 0;


        for(int i = 0; i < Num.length; i++){
            sum = sum + Num[i];
        }

        System.out.println(sum);

    }
}
