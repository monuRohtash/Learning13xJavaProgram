package ex_33_Collection_Framwork_DSA.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_004_HasMap_Interview {
    public static void main(String[] args) {



        Map map = new HashMap();
        map.put("id", 1);
        map.put("id", 2);
        map.put("id2", 2);
        map.put("id3", 34);
        map.put("id6", 34);
        map.put("id8", null);
        map.put("id83", null);
        map.put(null, 23);
        map.put(null, 233);



        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id6"));
        System.out.println(map.containsValue(22));

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.get("id3"));
        System.out.println(map.remove("id3"));

        System.out.println(map);
    }
}
