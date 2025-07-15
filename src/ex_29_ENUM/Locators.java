package ex_29_ENUM;

public enum Locators {

    userName("#Raghav123"),
    userEmail("#ABC@123"),
    userBtn("#btn");


    private String locators;

    Locators(String locators) {
        this.locators = locators;
    }


    String getLocators() {
        return locators;
    }
}
