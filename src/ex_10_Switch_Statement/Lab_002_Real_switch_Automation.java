package ex_10_Switch_Statement;

import java.util.Locale;
import java.util.Scanner;

public class Lab_002_Real_switch_Automation {
    public static void main(String[] args) {

        System.out.println("enter the name any browser");
        Scanner scanner = new Scanner(System.in);
        String browser = scanner.next();

        browser = browser.toUpperCase();         //switch is a case sentitive
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Execute the Chrome Browser");
                System.out.println("....Loading........");
                System.out.println("Open the SiteBrowser");
                break;
            case "fireFox":
                System.out.println("Execute the FireFox Browser");
                break;
           case "edge":
                System.out.println("Execute the Edge Browser");
                break;
            default:
                System.out.println("I have no idea other browser");
                break;


        }


    }
}
