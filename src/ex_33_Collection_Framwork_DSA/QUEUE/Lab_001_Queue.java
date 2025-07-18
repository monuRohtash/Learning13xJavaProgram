package ex_33_Collection_Framwork_DSA.QUEUE;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab_001_Queue {


    public static void main(String[] args) {


//✅ What is a Queue in Java?
//        A Queue is a linear data structure that works on the FIFO principle:
//
//        First-In, First-Out – the element added first is removed first.
//
//                It is part of the Java Collections Framework and comes from the java.util package.
//
//✅ Real-life Example of Queue:
//        People standing in a line at a ticket counter.
//
//                Tasks waiting in a printer queue.

//        Queue ek line ki tarah hoti hai jisme jo pehle aata hai woh pehle nikalta hai (FIFO).
//                Java me hum LinkedList, PriorityQueue ya ArrayDeque ka use karke queue bana sakte hain.



        Queue<String> queue = new LinkedList<>();
        // Add elements
        queue.add("Amit");
        queue.add("Rohit");
        queue.add("Simran");

        // Print queue
        System.out.println("Queue: " + queue);

        // Remove element
        String removed = queue.poll();  // removes head
        System.out.println("Removed: " + removed);

        // Peek at head
        String head = queue.peek();
        System.out.println("Current head: " + head);

        System.out.println("Queue after removal: " + queue);

    }
}
