package ex_18_2D_Array_Nested_Loop;

public class Lab_003_Array_Iterate_for_loop {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};               // 3 rows and 3 column
         // 3x3
        // Row -> 3
        // Column -> 3

         //  1, 2, 3
         //  4, 5, 6
         //  7, 8, 9

        /**   *🔁 What is a Nested Loop in Java?
         * A nested loop is a loop inside another loop. In Java (and most programming languages), you can place one loop
         * inside the body of another loop. This is useful when you want to perform repetitive tasks within other repetitive
         * tasks, like printing patterns, working with 2D arrays, or solving matrix *problems.
         */
                System.out.println(matrix.length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();               // Every Row create a new line
        }

    }
}
