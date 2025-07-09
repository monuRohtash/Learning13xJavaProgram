package Lab_002_Multilevel_Inheritance_p2;

public class Multilevel_inharitance {
    public static void main(String[] args) {


        Gfather Gf = new Gfather();                                  // Grand Father Property
        System.out.println( "Diamond -> " + Gf.daimond);
        Gf.iphone_pro_ultra_pro();

        System.out.println();

//        son_3 s = new Gfather();                             Not possible
        Gfather g = new Father_m();                        // Dynamic Dispatch
        Gfather g1 = new son_3();                          // Dynamic Dispatch
//        Father_m f1 = new Gfather();                         Not possible
        Father_m f2 = new son_3();                         // Dynamic Dispatch



        Father_m fm = new Father_m();                              // Grand Father + Father  Property
        System.out.println(fm.daimond);
        System.out.println(fm.gold_24);
        fm.iphone_pro_ultra_pro();
        fm.iphone_pro();

        System.out.println();

        son_3 s3 = new son_3();                                // Grand Father + Father + Son Property
        System.out.println(s3.daimond);
        System.out.println(s3.gold_24);
        System.out.println(s3.slver);

        s3.iphone_pro_ultra_pro();
        s3.iphone_pro();
        s3.iphone();







    }










}
