package ex_33_Collection_Framwork_DSA.Iterator;

import java.util.*;

public class Lab_001_ListIterator {
    public static void main(String[] args) {


//        What is Iterator in Java?
//                An Iterator is an object that allows you to loop through elements in a Collection (like List, Set, etc.)
//               one-by-one.

//        Iterator are used comman all the elements

        List<String> List = new ArrayList<>();
        List.add("item-1");
        List.add("item-2");
        List.add("item-3");
        List.add("item-4");
        List.add("item-5");



        ListIterator<String> listIterator = List.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
//   Previous -> ListIterator only for the abliable list

        while (listIterator.hasPrevious()) {
            System.out.println( "Previous Itrator" + listIterator.previous());
        }

//        Iterator ek aisa object hai jo collections ke elements ko ek-ek karke access karta hai.
//        Iska use hum tab karte hain jab hume elements ko safely loop aur remove karna ho.

        Iterator<String> iterator = List.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

