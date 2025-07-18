package ex_33_Collection_Framwork_DSA.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LAb_011_ALIst_interview {
    public static void main(String[] args) {


        List marks =  new ArrayList();
        marks.add(91);
        marks.add(56);
        marks.add(71);
        marks.add(31);
        marks.add(81);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);


        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }




}
