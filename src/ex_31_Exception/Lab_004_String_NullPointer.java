package ex_31_Exception;

public class Lab_004_String_NullPointer {
    public static void main(String[] args) {
        String name = null;
        name.trim();           // java.lang.NullPointerException
    }
}
