package ex_33_Collection_Framwork_DSA.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_012_User_Input_AList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String ContinuosInput = "Y";  // control variable for input loop

        while (ContinuosInput.equalsIgnoreCase("Y")) {

            System.out.println("Enter the name");
            String name = sc.next();
            names.add(name);

            System.out.println("Enter the age ");
            Integer age = sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("do You Want enter another record ? (Y/N):");
            ContinuosInput = sc.nextLine();
        }

        for (Object o1 : names) {
            System.out.println(o1);
        }
        for (Object o2 : ages) {
            System.out.println(o2);
        }
        sc.close();

    }
}
