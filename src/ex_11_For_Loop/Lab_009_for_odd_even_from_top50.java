package ex_11_For_Loop;

public class Lab_009_for_odd_even_from_top50 {
    public static void main(String[] args) {
        //find the even no. from 1 to 50

        for (int i = 1; i <= 50; i++){
            // i%2 ==0
            if (i%2 ==0){
                System.out.println("Even :->" +i);
            }
        }

    }
}
