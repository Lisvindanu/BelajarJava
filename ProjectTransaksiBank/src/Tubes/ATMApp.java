/*
 * Copyright (c) 2024. Create with strugle. Lisvindanu
 */

package Tubes;
import Tubes.services.Login;

import java.io.IOException;


public class ATMApp {
    public static void main(String[] args) {
        Login login = new Login();
        try {
            login.promptForCredentials();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
