package ex_016_StringBuffer_StringFunctions;

import java.sql.SQLOutput;

public class Lab_001_StringBuiler_VS_StringBuffer {
    public static void main(String[] args) {

        String s1 = "Raghav";
        String s2 = new String("Raghav");

  // These two are mutable nature
        StringBuffer stringBuffer = new StringBuffer("Raghav");
        StringBuilder stringBuilder = new StringBuilder("Raghav");


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);



    }
}
