package ex_11_For_Loop;

public class Lab_011_for_odd_Skip_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++){

            if (i ==5){
                continue;   // skip the code and move to next to top
            } else if (i == 10) {
                continue;    // skip the code and move to next to top
            }

            System.out.println(i);
        }
    }
}
