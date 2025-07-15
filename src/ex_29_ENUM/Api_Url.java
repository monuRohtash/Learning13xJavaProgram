package ex_29_ENUM;

public enum Api_Url {
    Vwo("https://vwo.com/"),
    Google("https://www.google.com/"),
    W3School("https://www.w3schools.com/");


    private String Api_Url;


    Api_Url(String apiUrl) {
        this.Api_Url = apiUrl;
    }

    public String getApi_Url() {
        return this.Api_Url;
    }
}
