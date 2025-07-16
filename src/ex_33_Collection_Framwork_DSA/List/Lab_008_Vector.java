package ex_33_Collection_Framwork_DSA.List;

import java.util.Iterator;
import java.util.Vector;

public class Lab_008_Vector {
    public static void main(String[] args) {

        Vector v = new Vector();
        Vector v1 = new Vector(10);


        v.add("monu");
        v.add("raghav");
        v.add("rohtash");
        v.add("duplicat");
        v.add("duplicat");
        System.out.println(v);
        v.remove("rohtash");
        System.out.println(v);
        System.out.println(v.contains("monu"));
        System.out.println(v.indexOf("raghav"));
        System.out.println(v);


        System.out.println("..............");
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        System.out.println(".....For Each Loop.........");

        for (Object s: v){
            System.out.println(s);
        }


        System.out.println(",,,,,,,,Iterator");

        Iterator iteratorn = v.iterator();
        while (iteratorn.hasNext()){
            System.out.println(iteratorn.hasNext());
        }




    }

}