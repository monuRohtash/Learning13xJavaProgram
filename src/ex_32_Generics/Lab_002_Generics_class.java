package ex_32_Generics;

public class Lab_002_Generics_class {
    public static void main(String[] args) {

        GenericClass g = new GenericClass(100);
        GenericClass g1 = new GenericClass("Raghav");
        GenericClass g2 = new GenericClass(6.66);
        GenericClass g3 = new GenericClass("6767676788");
        GenericClass g4 = new GenericClass(true);

    }
}


class GenericClass <T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
