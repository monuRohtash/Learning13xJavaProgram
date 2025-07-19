package ex_33_Collection_Framwork_DSA.Map;

import javax.naming.Name;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab_007_Hashtable {
    public static void main(String[] args) {
//        ✅ What is Hashtable in Java?
//                Hashtable is a class in Java that implements the Map interface and stores data in key-value pairs.
//        🔑 Key Points:
//        Synchronized (Thread-safe ✅)
//        No null key or null value allowed ❌
//        Slower than HashMap
//        Maintains no order

//        Hashtable<KeyType, ValueType> table = new Hashtable<>();



//        ⚠️ Hashtable vs HashMap
//        Feature	HashMap	Hashtable
//        Thread Safe	❌ No	✅ Yes
//        Allows null key	✅ Yes (1 null key)	❌ No null keys
//        Allows null value	✅ Yes	❌ No null values
//        Speed	Faster	Slower (due to sync)
//

        Hashtable<Integer,String > ht1 = new Hashtable<>();
        // Adding key-value pairs
        ht1.put(101, "Amit");
        ht1.put(102, "Rohit");
        ht1.put(103, "Sneha");
        ht1.put(104, "Sneha");
//        ht1.put(null, "Sneha");    //  not allowed null value and key
//        ht1.put(104, null);

        System.out.println(ht1);
//        / Accessing value by key
        System.out.println("Student with ID 102: " + ht1.get(102));

        for (Integer key: ht1.keySet()){
            System.out.println("Id -> " +key + ",  Name -> " + ht1.get(key));
        }


//        System.out.println("///////////");
//
        HashMap<Integer,String > hm1 = new HashMap<>();
        //Not Thread safe,
        hm1.put(1, "Amit");
        hm1.put(2, "Rohit");
        hm1.put(3, "Sneha");
        hm1.put(4, "Sneha");
        hm1.put(null, "Sneha");
        hm1.put(5, null);
        hm1.put(null, null);

        System.out.println(hm1);

        for (Integer key: hm1.keySet()){
            System.out.println("Id -> " +key + ",  Name -> " + hm1.get(key));
        }






    }
}
