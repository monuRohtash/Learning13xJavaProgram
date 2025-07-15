package ex_30_Warraper_Class;

public class Lab_005_Wrapper {


    public static void main(String[] args) {

    }
}


class newPhone extends OldPhone {


    newPhone() {
        System.out.println("DC");
    }

    private Integer phone;
    private String name;
    private Double price;
    static String mobile_Carrier = "airtel";


    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public newPhone(Integer phone, String name, Double price) {
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

//    void Dispaly() {
//        System.out.println(this.name, this.price, this.phone);
//    }


    static void switchOnAirplaneMode() {
        System.out.println("Commen Airplan Mode");

    }


    //Method OverLoading
    void priceChange(Integer Price) {
        System.out.println("Change Price in Integers");

    }

    //Method OverLoading
    void priceChange(Double Price) {
        System.out.println("Change Price in decimal");
    }

    @Override
    void calling() {
        System.out.println("dialpad");
    }

}

class OldPhone implements SimCard {

    void calling() {
        System.out.println("dialpad");
    }

    @Override
    public void enterCard() {
        System.out.println("Sim Card Entered ");
    }

}
interface SimCard {
    void enterCard();


}
