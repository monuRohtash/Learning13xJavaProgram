package ex_17_Arrays;

public class Lab_002_Array_p1 {
    public static void main(String[] args) {

        int [] marks = {1,2,3,4,5,6};
        marks[0] = 22;
        marks[1] = 22;
        marks[2] = 22;
        marks[3] = 22;
        marks[4] = 22;
        marks[5] = 22;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);







         // 2nd way create the array
        int[] marks2 = new int[5];             //Fixed Size , 5 -> 0 to 4
        marks2[0] = 13;
        marks2[1] = 22;
        marks2[2] = 44;
        marks2[3] = 55;
        marks2[4] = 88;

//        System.out.println(marks2.length);
        System.out.println(marks2[0]);
        System.out.println(marks2[1]);
        System.out.println(marks2[2]);
        System.out.println(marks2[3]);
        System.out.println(marks2[4]);




        String [] names = new String[3];        //Fixed Size , 3 -> 0 to 2
        names[0] = "monu";
        names[1] = "raghav";
        names[2] = "vikky";

        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);





    }
}
