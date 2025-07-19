package ex_33_Collection_Framwork_DSA.Map;

import java.util.*;

public class Lab_002_Map_p1 {
    public static void main(String[] args) {


        Map m1 = new HashMap();
        m1.put("name:", "Raghav");
        m1.put("Rollno:", 1);
        m1.put("Phone:", 805320621);
        m1.put("Age:", 28);

        System.out.println(m1);

        System.out.println("///////////////////////////");

        Map m2 = new LinkedHashMap();
        m2.put("name:", "Raghav");
        m2.put("Rollno:", 1);
        m2.put("Phone:", 805320621);
        m2.put("Age:", 28);

        System.out.println(m2);

        System.out.println("///////////////////////////");


        Map m3 = new TreeMap();
        m3.put("name:", "Raghav");
        m3.put("Rollno:", 1);
        m3.put("Phone:", 805320621);
        m3.put("Age:", 28);

        System.out.println(m3);

        System.out.println("///////////////////////////");

        Map m4 = new Hashtable();
        m4.put("name:", "Raghav");
        m4.put("Rollno:", 1);
        m4.put("Phone:", 805320621);
        m4.put("Age:", 28);

        System.out.println(m4);






    }
}
