package ex_33_Collection_Framwork_DSA.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab_007_LinkedList_p3 {
    public static void main(String[] args) {

        List list = new ArrayList(5);
        List list1 = new ArrayList(5);  //Array Format - Continuous

        List list2 = new LinkedList();  //Array Format - Continuous

        list2.add("raghav");
        list2.add("monu");
        list2.add("vikky");
        list2.add("sourav");
        list2.add("sujata");
        list2.add("Rohtash");
        list2.add(null);
        list2.add(true);
        list2.add(123);
        list2.addFirst("1st");
        list2.addLast("Last");
        System.out.println(list2);
        System.out.println(list2.isEmpty());
        System.out.println(list2.size());

        System.out.println("............");


        System.out.println(list2.contains("sourav"));
        System.out.println(list2.indexOf("vikky"));
        System.out.println(list2.get(0));


        System.out.println(",,,,,,,,Iterator");

        Iterator iterator = list2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}

