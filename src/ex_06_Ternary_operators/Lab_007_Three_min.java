package ex_06_Ternary_operators;

public class Lab_007_Three_min {

    public static void main(String[] args) {

        int  n1 = 2;
        int n2 = 9;
        int n3 =  11;

//        int min = n1 < n2 ?  A : B ;
//        //A -> n1 > n3 ? n1 : n3
//        //B -> n2 > n3 ? n2 : n3



        int min = n1 < n2 ? n1 < n3 ? n1: n3 : n2 < n3 ? n2 : n3;

        System.out.println(min);
    }
}
