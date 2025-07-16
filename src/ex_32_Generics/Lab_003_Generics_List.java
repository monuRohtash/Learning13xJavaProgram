package ex_32_Generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lab_003_Generics_List {
    public static void main(String[] args) {



        List normal_list = new ArrayList();    // use any data type in this list
        normal_list.add(10);
        normal_list.add("Raghav");
        normal_list.add(true);
        System.out.println(normal_list);


        List<Integer> integerlist = new ArrayList();  //Not use any data type in this list because <Integer> is a menstions
        integerlist.add(10);
//        integerlist.add("Raghav");



        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");  // Duplicate ignored

        System.out.println(fruits);  // [Banana, Apple]




    }
}
