package ex_03_Literals;

public class Lab003_Characters {
    public static <Char> void main(String[] args) {
        char c1 = 'A';  // A to z , a-z, ! @ # $ % ^ & * () _ +


        //Escape Char
        char new_line = '\n';             // add a 	New line
        char tab_Space = '\t';              //Add a space
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("MonuRaghav");

        System.out.println("Monu"+new_line+"Raghav");

        System.out.println("Monu"+tab_Space+"Raghav");

        System.out.println("Monu"+back_space+"Raghav");

        System.out.println("Monu"+carriage_return+"Raghav");


    }
}