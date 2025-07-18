package ex_33_Collection_Framwork_DSA.List;

import java.util.Stack;

public class Lab_Stack {
    public static void main(String[] args) {


//        ✅ What is Stack in Java?
//                Stack is a linear data structure that follows the LIFO principle:
//
//        LIFO = Last In, First Out
//        मतलब: जो सबसे last mein add hua, वही सबसे पहले निकलेगा.
//
//       📦 Real-life Example:
//        Plate stack in a canteen 🥄
//        You add plates on top (push)
//        You remove plates from top (pop)
//
//        ✅ Common Methods in Stack:
//        Method	Description
//        push(item)	Add item on top
//        pop()	Remove and return top item
//        peek()	Return top item (without removing)
//        isEmpty()	Check if stack is empty
//        search(item)	Search for item and return position




        Stack s1 = new Stack();
        s1.add("#Java");
        s1.add("#Python");
        s1.add("#C++");
        System.out.println("Stack: " + s1);  // [Java, Python, C++]

        // Remove top book
        System.out.println("Pop: " + s1.pop());  // C++

        // Peek at top book
        System.out.println("Peek: " + s1.peek());  // Python

        // Is stack empty?
        System.out.println("Is empty? " + s1.isEmpty());  // false

        // Final stack
        System.out.println("Final Stack: " + s1);  // [Java, Python]

        s1.push("Ruby And Rails");
        System.out.println(s1);


        System.out.println("...................");

        Stack<Integer> intStack = new Stack<>();
        intStack.push(23);
        intStack.push(25);
        intStack.push(29);
        System.out.println(intStack);


    }
}
