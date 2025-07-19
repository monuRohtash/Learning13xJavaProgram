package ex_33_Collection_Framwork_DSA.Map;

import java.util.*;

public class Lab_005_Real_Examples {

    public static void main(String[] args) {


        // Map stor Key NAd Value Pair
        Map<String, Object> student1 = new HashMap<>();
        student1.put("name", "Raghav");
        student1.put("phone", 9876789876l);
        student1.put("address1", "palwal");
        student1.put("PinCode", 121102);

        // Map stor Key NAd Value Pair
        Map<String, Object> student2 = new HashMap<>();
        student2.put("name", "Deepak");
        student2.put("phone", 8976545453l);
        student2.put("address1", "Delhi");
        student2.put("PinCode", 110005);


        // List Store list of Elements
        List list = new ArrayList();
        list.add(student1);
        list.add(student2);
        System.out.println(list);

// set store not duplicate elements
        Set book_collection_Item = new HashSet();
        book_collection_Item.add("Rich Dad POor Dad");
        book_collection_Item.add("Sapaiens");
        book_collection_Item.add("Secret");
        book_collection_Item.add("Eat That Frog");
        book_collection_Item.add("Atomic Habit");
        book_collection_Item.add("Atomic Habit");   // NOt Duplicat value

        for (Object s : book_collection_Item) {
            System.out.println(s);
        }


    }
}
