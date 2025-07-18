package ex_33_Collection_Framwork_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_010_Nested_ArrayList {
    public static void main(String[] args) {

//        Nested ArrayList ka matlab:
//        Ek list ke andar dusri list store karna.
//
//        Jaise: School ke classes aur har class ke andar students.

        List fruits1 = new ArrayList<>();
        fruits1.add("orange");
        fruits1.add("Apple");
        fruits1.add("Banana");
        System.out.println(fruits1);

        List fruits2= new ArrayList<>();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println(fruits2);


        List Vegitables = new ArrayList<>();
        Vegitables.add("orange");
        Vegitables.add("Apple");
        Vegitables.add("Banana");
        System.out.println(Vegitables);

        // Add each category list to main vegetables list
        System.out.println(".............");

        List all_Fruits = new ArrayList();
        all_Fruits.addLast(fruits1);
        all_Fruits.addLast(fruits2);
        all_Fruits.addLast(Vegitables);
//        System.out.println(all_Fruits);


        // Print complete vegetable list
        for (Object o: all_Fruits){
            System.out.println("Nested Array List" + o);
        }




    }
}
