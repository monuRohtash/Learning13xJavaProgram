package ex_017_Arrays;

public class Lab_011_Array_find_element_linear_search {

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
