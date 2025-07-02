package ex_17_Arrays;

public class Lab_012_Array_find_element_linear_search {

    public static void main(String[] args) {

        int[] a = {23, 34, 55, 77, 54, 90};
        //find the target 77, give index ?

        int target = 77;
        for (int i = 0; i < a.length; i++) {
            if (target == a[i]) {
                System.out.println(i);
            }
        }

    }
}
