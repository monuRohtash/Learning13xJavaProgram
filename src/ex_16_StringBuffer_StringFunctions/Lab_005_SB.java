package ex_16_StringBuffer_StringFunctions;

public class Lab_005_SB {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java"); 
        sb.append("Programming");
        System.out.println(sb);
        sb.delete(4,16);
        System.out.println(sb);
        sb.replace(0, 4, "Coding");
        System.out.println(sb);






    }


}
