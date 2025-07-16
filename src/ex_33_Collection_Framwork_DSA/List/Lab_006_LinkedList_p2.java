package ex_33_Collection_Framwork_DSA.List;

import java.util.LinkedList;

public class Lab_006_LinkedList_p2 {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList();

        linkedList.add("Monu");
        linkedList.add("Raghav");
        linkedList.addFirst("Lion");
        linkedList.addLast("CAt");
        linkedList.addLast("Cat");
        System.out.println("Liked List" + linkedList);

        //Accessing elements
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        // Removeing elements
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("Linkedlist after remove :" + linkedList);
        System.out.println("size of inkedlist:" + linkedList.size());









    }
}
