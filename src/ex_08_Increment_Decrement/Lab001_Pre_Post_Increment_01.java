package ex_08_Increment_Decrement;

public class Lab001_Pre_Post_Increment_01 {
    public static void main(String[] args) {


        //Increment first and then print
//.............Pre..Increment...........
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        //OutPut 11 , 11

//............Pre..Increment.............

        int i = 9;
        System.out.println(++i);
        System.out.println(i);
        //Output -> 10, 10



//............Post..Increment..............
//        Print First and then Increment

        System.out.println("           Print First and then Increment          ");

        int p_post = 10;
        System.out.println(p_post++);
        System.out.println(p_post);

        //output 10, 11


//............Post..Increment..............


        System.out.println("           Print First and then Increment          ");

        int a_posts = 10;
        int b_post = a_posts++;
        System.out.println(a_posts);
        System.out.println(b_post);
        //output  11 , 10






    }
}
