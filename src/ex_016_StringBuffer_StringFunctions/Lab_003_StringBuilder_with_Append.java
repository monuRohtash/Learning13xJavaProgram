package ex_016_StringBuffer_StringFunctions;

import java.sql.SQLOutput;

public class Lab_003_StringBuilder_with_Append {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Monu");
        stringBuilder.append("@gmail.com");
        stringBuilder.append("1234");

        System.out.println(stringBuilder);

        // ................................................................
        String s1 = "M";
        String s2 = "O";
        String s3 = "N";
        String s4 = "U";
        String s5 = s1 + s2 + s3 + s4;

        System.out.println(s5);




    }
}
