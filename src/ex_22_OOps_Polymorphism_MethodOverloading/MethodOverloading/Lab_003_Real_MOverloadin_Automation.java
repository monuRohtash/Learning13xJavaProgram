package ex_22_OOps_Polymorphism_MethodOverloading.MethodOverloading;

public class Lab_003_Real_MOverloadin_Automation {
    public static void main(String[] args) {

        Browser b1 = new Browser();
        b1.StartBrowser();

        b1.StartBrowser("Chrome");

    }
}


class Browser{


    void StartBrowser(){
        System.out.println("Starting a default browser");
    }

    String StartBrowser(String browser){
        System.out.println("Starting Browser " + browser);
        return browser;
    }



}
