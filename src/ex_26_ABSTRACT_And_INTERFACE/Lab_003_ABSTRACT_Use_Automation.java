package ex_26_ABSTRACT_And_INTERFACE;

public class Lab_003_ABSTRACT_Use_Automation {
    public static void main(String[] args) {


        LoginTest test = new LoginTest();
        test.AllTestRun();


    }
}

abstract class BaseTest {

    //Non Abstract method
    void LaunchBrowser() {
        System.out.println("Starting the Browser");
    }

    //Abstract Method
    abstract void TestRun();

    void CloseBrowser() {
        System.out.println("Closing the Browser");
    }
}


class LoginTest extends BaseTest {


    @Override
    void TestRun() {
        System.out.println("Login Test is running");
    }

    void AllTestRun() {
        LaunchBrowser();
        TestRun();
        CloseBrowser();
    }

}
