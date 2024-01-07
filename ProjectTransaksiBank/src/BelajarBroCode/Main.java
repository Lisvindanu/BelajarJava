package BelajarBroCode;

public class Main {
    public static void main(String[] args) {

        IdPassword idPassword = new IdPassword();



        LoginPage loginPage = new LoginPage( idPassword.getLogininfo());
    }



}