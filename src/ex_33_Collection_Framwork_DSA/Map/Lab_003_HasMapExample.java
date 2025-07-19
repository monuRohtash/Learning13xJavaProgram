package ex_33_Collection_Framwork_DSA.Map;

import java.util.HashMap;

public class Lab_003_HasMapExample {
    public static void main(String[] args) {

        HashMap <String, Integer> vehicles= new HashMap();
        vehicles.put("Oddi" , 1);
        vehicles.put("Mahindra" , 2);
        vehicles.put("BMW" , 3);
        vehicles.put("Punch" , 2);
        vehicles.put("Tesla" , 5);
        vehicles.put("Tesla" , 10);   // duplicate update tha key value



        System.out.println("Total Vehical -> "+ vehicles.size());


        for (String key: vehicles.keySet()){
            System.out.println(key + ":->  " + vehicles.get(key));
        }



       if (vehicles.containsKey("maruti")){
           System.out.println("Yes - Present");
       }else{
           System.out.println("No - Not Present");
       }

       vehicles.clear();
        System.out.println("after clear , size" + vehicles.size());

    }

}
