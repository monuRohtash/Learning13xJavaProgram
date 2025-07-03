package ex_20_OOps_Constructor;

public class Lab_004_Parameterized_Constructor {
    public static void main(String[] args) {

        int Serial = 1;

//        BabyA b1 = new BabyA();
//        BabyA b2 = new BabyA();
//        System.out.println(b1.name);
//        System.out.println(b2.name);

// Constructor with parameters
        BabyA b3 = new BabyA("lucky","728177305134", 2025, 10, 01);
        System.out.println("Serial no. " + Serial++);
        System.out.println(b3.name);
        System.out.println(b3.aadhar_number);
        System.out.println(b3.year);
        System.out.println(b3.month);
        System.out.println(b3.day);


        BabyA b4 = new BabyA("Raghav","34567876543212", 2021, 11, 05);
        System.out.println("Serial no. " + Serial++);
        System.out.println(b4.name);
        System.out.println(b4.aadhar_number);
        System.out.println(b4.year);
        System.out.println(b4.month);
        System.out.println(b4.day);









    }


}
class BabyA{
    String name;
    String aadhar_number;
    int year;
    int month;
    int day;

//    BabyA(){
//        name = "Gugu";
//        aadhar_number = "xxxx xxxx xxxx";
//        year = 1996;
//        month = 11;
//        day = 01;
//    }

    // Constructor with parameters
    BabyA(String user_name, String aadhar_number_user, int year_user, int month_user, int day_user){
        this.name = user_name;
        this.aadhar_number = aadhar_number_user;
        this.year = year_user;
        this.month = month_user;
        this.day = day_user;
        System.out.println();


    }



}




