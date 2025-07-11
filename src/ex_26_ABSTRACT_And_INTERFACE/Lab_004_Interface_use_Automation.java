package ex_26_ABSTRACT_And_INTERFACE;

public class Lab_004_Interface_use_Automation {

    public static void main(String[] args) {

        Registration test = new Registration();
        test.tetshub();


        // default method call
        test.complete();

        // static method call
        TestCase.staticComplete();

    }
}


interface TestCase {

    void LaunchBrowser();

    void TestRun();

    void CloseBrowser();

    default void complete() {
        System.out.println("Default method is a Possible in interface ");
    }

    default void complete2() {
        System.out.println("This is a Possible");
    }


  static void staticComplete(){
      System.out.println("static interface  allowed , complete ");
      System.out.println("static method is a Possible in interface");

  }

}


class Registration implements TestCase {

    public void LaunchBrowser() {
        System.out.println("Launching the browser");
    }

    public void TestRun() {
        System.out.println("Execute the test");
    }

    public void CloseBrowser() {
        System.out.println("close the browser !");
    }

    public void tetshub() {
        LaunchBrowser();
        TestRun();
        CloseBrowser();
    }

}
