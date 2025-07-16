package ex_33_Collection_Framwork_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_002_List {
    public static void main(String[] args) {
//        List l = new ArrayList();       // dynamic dispatch
        // list father of ArrayList
        ArrayList l = new ArrayList();

        l.add("hello");
        l.add(123);
        l.add(true);
        l.add(876428734);

        System.out.println(l);
        System.out.println(l.size());


        List list = new ArrayList();
        list.add("123");
        list.add("456");
        System.out.println(list);
        System.out.println(" list is " + list.isEmpty());


        List list2 = new ArrayList();
        System.out.println(" list is " + list2.isEmpty());

    }
}
