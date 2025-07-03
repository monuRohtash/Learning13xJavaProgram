package ex_20_OOps_Constructor;

public class Lab_003_Constructor_p3 {
    public static void main(String[] args) {

        int serialNo = 1;

        car c1 = new car();

        c1.name  = "Tesla";
        c1.year = 2025;
        c1.model = "3XO 300";

        System.out.println(serialNo++ + ". " + c1.name);
        System.out.println("   " + c1.year);
        System.out.println("   " + c1.model);

        car c2 = new car();

        c2.name  = "Mahindra";
        c2.year = 2020;
        c2.model = "3XO 300";

        System.out.println(serialNo++ + ". " + c2.name);
        System.out.println("   " + c2.year);
        System.out.println("   " + c2.model);

        car c3 = new car();

        c3.name  = "TaTa";
        c3.year = 2022;
        c3.model = "3XO 300";

        System.out.println(serialNo++ + ". " + c3.name);
        System.out.println("   " + c3.year);
        System.out.println("   " + c3.model);

        car c4 = new car();

        c4.name  = "Punch";
        c4.year = 2025;
        c4.model = "3XO 300";

        System.out.println(serialNo++ + ". " + c4.name);
        System.out.println("   " + c4.year);
        System.out.println("   " + c4.model);


    }

}



class car{
    String name;
    int year;
    String model;

     car(){
         name = "Unknow car";
          year = 1991;
          model = "xxx";
         System.out.println();
         System.out.println("This is a car Details! | | ");
     }




}
