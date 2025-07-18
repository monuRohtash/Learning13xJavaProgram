package ex_33_Collection_Framwork_DSA.Set;

import java.util.*;

public class Lab_001_Set {
    public static void main(String[] args) {

        /**
         *  ✅ What is a Set in Java?

         * Set is a Collection that doesn’t allow duplicate elements.
         *  It is unordered (no index, no guaranteed order).
         * Used when you want unique values only

         * Explanation:
         * Set ek collection hota hai jo duplicate values ko allow nahi karta.

         * 3 types hote hain:
         * HashSet – random order
         * LinkedHashSet – jis order me add kiya, usi order me dikhega
         * TreeSet – sorted order me values hoti hain
         */

        // HashSet – random order
        Set<String> fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana");  // Duplicate
        fruits.add(null);
        System.out.println("HashSet: " + fruits);

        for (String s : fruits) {
            System.out.println(s);
        }

        System.out.println("..........Iterator1.......");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // LinkedHashSet – jis order me add kiya, usi order me dikhega
        Set<String> veggies = new LinkedHashSet<>();
        veggies.add("Carrot");
        veggies.add("Tomato");
        veggies.add("Potato");
        veggies.add("Carrot"); // Duplicate
        veggies.add(null);
        System.out.println("LinkedHashSet: " + veggies);

        for (String s : veggies) {
            System.out.println(s);
        }


        System.out.println("..........Iterator1.......");
        Iterator<String> iterator1 = veggies.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }


        // TreeSet – sorted order me values hoti hain
        Set<Integer> marks = new TreeSet<>();
        marks.add(75);
        marks.add(50);
        marks.add(90);
        marks.add(75);  // Duplicate

        System.out.println("TreeSet: " + marks);

        for (Integer i : marks) {
            System.out.println(i);
        }

        System.out.println("..........Iterator1.......");
        Iterator<Integer> iterator2 = marks.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }


    }


}
