package ex_11_For_Loop;

public class Lab_010_for_loop_Break {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++){      //0 to 49 -> 50 times
            if (i == 5) {// run 0 to 4  -> 5 times
                break;       // stop this code
            }else{
                System.out.println(i);
            }
        }
    }
}
