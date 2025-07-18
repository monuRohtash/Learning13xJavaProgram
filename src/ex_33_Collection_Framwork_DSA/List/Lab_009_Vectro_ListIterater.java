package ex_33_Collection_Framwork_DSA.List;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab_009_Vectro_ListIterater {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("item-1");
        vector.add("item-2");
        vector.add("item-3");
        vector.add("item-4");
        vector.add("item-5");

        ListIterator listIterator = vector.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
//   Previous -> ListIterator only for the abliable list

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }


        Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
