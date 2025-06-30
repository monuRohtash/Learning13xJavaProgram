package ex_15_String;

public class Lab_008_String_Function_p2 {
    public static void main(String[] args) {

        String name = "Raghav"; // 0,1,2,3,4,5
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(0));


        // concat()
        System.out.println(name.concat("Monu"));    //merge the world for concat

        // contains()
        System.out.println(name.contains("om"));

        // equals()
        System.out.println(name.equals("Raghav"));

        // equalsIsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("raghav"));

        // indexOf()     // raghav -> ? o
        System.out.println(name.indexOf('0'));

        String s1 = "madam";   // 0,1,2,3,4
        //Return the index within this string of the first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));
        System.out.println(s1.lastIndexOf("m"));

        // length()
        System.out.println(name.length());

        // replace( , )
        System.out.println(name.replace('g', 'G'));

        // Split()        // 0 , 1 ,2
        String name4 = "raghav@g2345gmail.com@123";                // 0 | 1 | 2
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);

        //  Substring(,)                          // 0,1,2,3,4,   output is -> ag // because is last -1
        System.out.println(name.substring(1, 3));  // Raghav

        // toLowerCase()
        System.out.println("RAGHAV".toLowerCase());

        // toLowerCase()
        System.out.println("raghav".toUpperCase());

        // startsWith()
        System.out.println(name.startsWith("R")); // Raghav

        //endsWith()
        System.out.println(name.endsWith("v"));   // Raghav


        // SubString: Extracts a portion of string
        //String basically means cutting down the string basec on the begining and the end  index

                                 //0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
        String anotherParlindrom = "Raghav. from Palwal!";
        System.out.println(anotherParlindrom.length());

        String extract = anotherParlindrom.substring( 8,13 );    //-1
        System.out.println(extract);


        // Concatenation (By +)

        String  s111 = "Monu ";
        String s222 = "Raghav ";

        String s333 = "Ji";
        String result = s111 + s222 +s333;
        System.out.println(result);

        //

        String n = "MOnuragHAV";
        System.out.println(n.indexOf("M"));
        System.out.println(n.lastIndexOf("M"));
        System.out.println(n.lastIndexOf("H"));














    }
}
