package ex_20_OOps_Constructor;

public class Lab_005_Parameterized_Constructor_p1 {
    public static void main(String[] args) {

        person p1 = new person("Raghav", 805320626, "Palwal Haryana" );
        System.out.println(p1.name);
        System.out.println(p1.phone);
        System.out.println(p1.address);

    }
}



class person{

    String name;
    long phone;
    String address;

    person(String user_Name, long user_phone, String user_address){
        this.name = user_Name;
        this.phone = user_phone;
        this.address = user_address;

        System.out.println();

    }

}
