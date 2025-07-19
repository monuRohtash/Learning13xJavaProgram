package ex_33_Collection_Framwork_DSA.Map;

import java.util.Map;
import java.util.TreeMap;

public class Lab_008_TreeMap_Example {
    public static void main(String[] args) {

        // Creating TreeMap

        Map<String, Integer> values = new TreeMap<>();
        //Insert elements (note the order)

        values.put("second", 2);
        values.put("first", 1);
        values.put("third", 3);

        System.out.println("TreeMap (sorted by keys)"  +values);

        values.replace("first", 11);
        values.replace("second" ,22);

        System.out.println("After Replacing  " + values);

         int removedValue = values.remove("first");
        System.out.println("Remove value" + removedValue);
        System.out.println("Final map" + values);







    }
}
