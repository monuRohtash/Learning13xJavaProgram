package ex_23_Oops_Encapsulation;

public class Lab_003_Real_Login_Examp {
    public static void main(String[] args) {

        login login  = new login("monu", "Admin@123");

        String userName = login.getUserName();
        System.out.println(userName);

        String UserPass = login.getUserPass();
        System.out.println(UserPass);

        login.setUserPass("Raghav@123", true);

        String userpass1 = login.getUserPass();
        System.out.println(userpass1);

    }
}


class login {

    private String userName;
    private String UserPass;


    public login(String userName, String userPass) {
        this.userName = userName;
        UserPass = userPass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return UserPass;
    }

    public void setUserPass(String userPass, boolean isAdmin) {
       if ( isAdmin){
           UserPass = userPass;
       }else {
           System.out.println("Can't chnage User PassWord");
       }
    }
}
