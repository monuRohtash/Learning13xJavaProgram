package ex_33_Collection_Framwork_DSA.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_009_Coding_FrequencyCounter_Char {
    public static void main(String[] args) {
String input = "programming";

        Map<Character, Integer> freqMap  = new HashMap<>();
        for (char c: input.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0)+ 1);

        }
        System.out.println(freqMap);
        System.out.println(freqMap.size());

    }
}
