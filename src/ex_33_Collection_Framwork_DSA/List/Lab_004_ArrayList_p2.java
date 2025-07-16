package ex_33_Collection_Framwork_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_004_ArrayList_p2 {

    public static void main(String[] args) {


//      List list =new ArrayList();
        List list = new ArrayList(10);

        list.add("1"); //0
        list.add("2"); //1
        list.add("3"); //2
        list.add("3"); //3
        list.add(4);  //4
        list.add(true); //5
        list.add("Monu Raghav");
        list.add("Monu Raghav");
        list.add("Monu Raghav");
        list.add("Monu Raghav");
        list.add("Monu Raghav");
        list.add("3"); //6

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(4));

        // Return the index od the first occurrence of the specified element

        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));

        System.out.println();

        System.out.println("---------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------");
        for (Object o: list){
            System.out.println(o);
        }

        System.out.println("---------------");

        list.set(1,223);
        System.out.println(list);

        list.remove(0);    // remove element at index 0
        System.out.println(list);


        list.clear();
        System.out.println(list);





    }
}
