package ex_18_2D_Array_Nested_Loop;

public class Lab_005_2d_Ulta_Triangle {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter The value");
//        int left = scanner.nextInt();

        int left = 3;


        for (int i = left; i >=1 ; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}

