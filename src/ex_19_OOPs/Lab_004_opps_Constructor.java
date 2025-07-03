package ex_19_OOPs;

import java.sql.SQLOutput;

public class Lab_004_opps_Constructor {

    public static void main(String[] args) {
         Student s1 = new Student();
         Student s2 = new Student();


// Remember this they can create only 1 public class

    }
}



//  You can have create unlimited class

class Student {
    String name;

     // Is called as the default constructor, same name as the class name.
    Student() {
        System.out.println("This is a Default Constructor, is is a automatically called");
    }
}
