package ex_02_Variables_and_Data_Types;

public class Lab012_Local_Variable {

    int t;    //its a not local variable  , so this is a instant variable
    static int s;
    //its a default value not local value,  it is a default value -> 0


    public static void main(String[] args) {


    //    Local variables in Java are variables declared inside a method, constructor, or block and can only be used
    //    within that method or block. They are created when the method is called and destroyed when it exits.

        //jvm never assign default value of local variable

        int i = 10;
        System.out.println(i);    //this is local variable


        //Accessible only within the scope where declared in block{}
        {
            int b =50;
            System.out.println("Accessible only within the scope where declared in block ." +b);
        }



        int b = 40;

        System.out.println(b);
    }


}
