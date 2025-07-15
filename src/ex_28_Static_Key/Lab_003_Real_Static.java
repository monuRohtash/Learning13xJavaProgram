package ex_28_Static_Key;

public class Lab_003_Real_Static {
    public static void main(String[] args) {

        ATB atb = new ATB();

    }
}





class ATB{

    static {
        System.out.println("load the class?,  i will execute");
    }

    {
        System.out.println("IIB - this is called when object is created! ");

        //what is the purpose
        // here you can write code related to
        // start a website or anything before starting the web automation or api autiomation
    }

    private String name;  // non static

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String Phone;

    static String courseName = "ATB13X";
    static String mentorName = "Pramod";


    static void doAssignment(){
        System.out.println("Do Assignment");
    }

    static void joinZoomClass(){
        System.out.println("Class Joined!");
    }

    void howTheyAssignment(){
        System.out.println("It is Different");
    }

}