package ex_23_Oops_Encapsulation;

public class Lab_002_Real_Bank_Example {
    public static void main(String[] args) {
        ICIBank raghav = new ICIBank("Raghav", 1000);



        long bal = raghav.getBal();
        System.out.println(bal);
        raghav.setBal(500, true);

        long bal2 = raghav.getBal();
        System.out.println(bal2);


    }
}


class ICIBank {

    // Private variables (data hiding)
    private String name;
    private long bal;

    // Make A Constructor
    public ICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }
    // Make A Getter setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not Allowed To Change the Balance ");
        }

    }
}

