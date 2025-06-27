package ex_14_Functions;

public class Lab_004_User_Defined_one {
    public static void main(String[] args) {

//
        int result = sum_of_number(4, 5);
        System.out.println(result);


        sum_of_number_no_return(4 , 6);


        sum_of_number_no_return_3rd();

    };

//                              Defi- parameter
    static int sum_of_number(int a, int b){
        return a + b;
    };



    static void sum_of_number_no_return(int a, int b){
        System.out.println(a+b);
    }


    static void sum_of_number_no_return_3rd(){
        int k = 8;
        System.out.println("3rd function" + k);
    }

}
