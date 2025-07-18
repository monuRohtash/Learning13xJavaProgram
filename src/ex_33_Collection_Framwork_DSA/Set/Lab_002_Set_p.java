package ex_33_Collection_Framwork_DSA.Set;

import java.util.*;

public class Lab_002_Set_p {
    public static void main(String[] args) {

// HashSet – random order
        Set<String> fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana");  // Duplicate

        System.out.println("HashSet: " + fruits);



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

        System.out.println("LinkedHashSet: " + veggies);



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
        System.out.println(marks.size());
        System.out.println(marks.contains(75));
        System.out.println(marks.isEmpty());



        System.out.println("..........Iterator1.......");
        Iterator<Integer> iterator2 = marks.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }




    }
}
