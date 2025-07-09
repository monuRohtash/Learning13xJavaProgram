package ex_21_OOps_Inheritance.Lab_001_Single_inheritance;

public class RealSingle_Run {

    public static void main(String[] args) {

        TestCase1 t1 = new TestCase1();
        t1.runningTc1();

        System.out.println(".........");

        t1.runningTc2();

        System.out.println(".........");

        TestCase2 t2 = new TestCase2();

        t2.runningTc3();

        System.out.println(".........");

        t2.runningTc4();


        //this called a  Dynamic Dispatch

        CommonToAll t3 = new TestCase1();    //this called a  Dynamic Dispatch  ->  with extend relationship both
        t3.startBrowser();
        t3.readExcelFile();
        t3.readDataBaseFile();
        t3.closeBrowser();

//        WebDriver driver = new ChromeDriver();

    }
}
