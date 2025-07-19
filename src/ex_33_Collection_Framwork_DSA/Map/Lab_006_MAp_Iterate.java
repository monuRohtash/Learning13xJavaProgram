package ex_33_Collection_Framwork_DSA.Map;

import java.util.*;

public class Lab_006_MAp_Iterate {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Amit");
        students.put(2, "Rohit");
        students.put(3, "Sneha");
        students.put(4, null);

        System.out.println(students.size());


//        ✅ 1. Iterate using keySet() (Get keys → then values)

        System.out.println("Using keySet():");
        for (Integer key : students.keySet()) {
            System.out.println("Key: " + key + ", Value: " + students.get(key));
        }


//        ✅ 2. Iterate using entrySet() (Most efficient)

        System.out.println("\nUsing entrySet():");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


//         ✅3. Iterate using forEach() method(Java 8 +)

        System.out.println("\nUsing forEach():");
        students.forEach((key, value) -> {
            System.out.println("Key:->" + key + "Value:->" + value);
        });


    }
}
