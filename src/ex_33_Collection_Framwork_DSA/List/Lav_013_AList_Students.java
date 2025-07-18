package ex_33_Collection_Framwork_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lav_013_AList_Students {
    public static void main(String[] args) {

        student s1 = new student("amit", "1");
        student s2 = new student("rohit", "2");
        student s3 = new student("deepak", "3");
        student s4 = new student("sanju", "4");
        student s5 = new student("simran", "5");


        List <student> SList = new ArrayList<>();
        SList.add(s1);
        SList.add(s2);
        SList.add(s3);
        SList.add(s4);
        SList.add(s5);
        System.out.println(SList);


        for (student s: SList){         // One By One print krne ke liye
            s.printDetail();
        }  // OutPut
//        Student Details: Name = amit, Roll No = 1
//        Student Details: Name = rohit, Roll No = 2
//        Student Details: Name = deepak, Roll No = 3
//        Student Details: Name = sanju, Roll No = 4
//        Student Details: Name = simran, Roll No = 5

    }
}

class student{
    private String name;
    private String roll_no;

    public student(String name, String roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    void printDetail() {
        System.out.println("Student Details: Name = " + name + ", Roll No = " + roll_no);
    }




    @Override
    public String toString() {
        return "[Name: " + name + ",Roll no: "+roll_no+"]";
    }
}
