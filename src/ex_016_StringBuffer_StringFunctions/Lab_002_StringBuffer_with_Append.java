package ex_016_StringBuffer_StringFunctions;

public class Lab_002_StringBuffer_with_Append {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Monu");
        stringBuffer.append("Raghav");
        System.out.println(stringBuffer);

        //reverse
        System.out.println(stringBuffer.reverse());



        // ................................................................
        String s1 = "M";
        String s2 = "O";
        String s3 = "N";
        String s4 = "U";
        String s5 = s1 + s2 + s3 + s4;

        System.out.println(s5);




    }
}
