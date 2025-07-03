package ex_20_OOps_Constructor;

public class Lab_001_OOPs_Constructor {
    public static void main(String[] args) {

        Baby b1 = new Baby();

    }
}

class Baby {

    Baby() {
        System.out.println("I am a Default Constructor!");
        System.out.println("your Aadhar Number is Ready!");

        // Fetch data from the MySql Database
        //Read from CSV file, XLSL
        // Open A file And Ready the data.(json, testdata.xlsl, txt file)
    }

    void cry() {
        System.out.println("Cry!");
    }

    void sleep() {
        System.out.println("Sleep!");
    }

    void eat() {
        System.out.println("Eat!");
    }


}
