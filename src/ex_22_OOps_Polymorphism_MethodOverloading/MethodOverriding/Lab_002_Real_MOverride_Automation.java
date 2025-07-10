package ex_22_OOps_Polymorphism_MethodOverloading.MethodOverriding;

public class Lab_002_Real_MOverride_Automation {
    public static void main(String[] args) {

        CommonToAll CommonToAll = new CommonToAll();
        CommonToAll.OpenBrowser();

        ChromeTc  c1 = new ChromeTc();
        c1.OpenBrowser();

        FireFox f1 = new FireFox();
        f1.OpenBrowser();


        //Dynamic Dispatch
        CommonToAll  Dynamic_Dispatch = new ChromeTc();
        Dynamic_Dispatch.OpenBrowser();

        CommonToAll Dynamic_Dispatch1 = new FireFox();
        Dynamic_Dispatch1.OpenBrowser();

//        ChromeTc Dynamic_Dispatch2 = new CommonToAll();           // They Have Not Realtionship






    }
}


class CommonToAll {
    void OpenBrowser() {
        System.out.println("Starting IE browser");

    }
}

class ChromeTc extends CommonToAll {

    @Override
    void OpenBrowser() {
        System.out.println("Starting Chrome browser");

    }

}

class FireFox extends ChromeTc {
    @Override
    void OpenBrowser() {
        System.out.println("Starting FireFox browser");

    }
}