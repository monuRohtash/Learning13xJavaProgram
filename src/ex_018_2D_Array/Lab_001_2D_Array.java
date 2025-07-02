package ex_018_2D_Array;

import java.util.Arrays;

public class Lab_001_2D_Array {
    public static void main(String[] args) {


            // 1, 2, 3
            // 4, 5, 6           // 3 rows and 3 colum
           //  7, 8, 9

        int[][] array_2d_old = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };



             // 10, 20
             // 30, 40        //2 rwos and 3 column
             // 50, 60

        int[][] array = new int[][]{

                {10, 20},
                {30, 40},
                {50, 60}
        };




        int[][] array_2d = new int[3][3];


        array_2d[0][0] = 1;
        array_2d[0][1] = 2;
        array_2d[0][2] = 3;

        array_2d[1][1] = 0;
        array_2d[1][2] = 1;
        array_2d[1][3] = 2;

        array_2d[2][2] = 0;
        array_2d[2][3] = 1;
        array_2d[2][4] = 2;



        //  Jagged Array
        //  java allow jagged aarays where each row can have a different lenght

        int[][] jagged_Array = {
                {1, 2, 3},
                {4, 5, 6, 7, 9},
                {8}
        };










    }
}
