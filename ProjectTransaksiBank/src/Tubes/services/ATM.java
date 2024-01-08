package Tubes.services;

import Tubes.Entity.Admin;
import Tubes.Entity.User;
import Tubes.View.AdminView;
import Tubes.View.UserView;

import java.io.IOException;

public class ATM {
    private FileNasabahService fileNasabahService;
    private Admin admin;
    private User user;
    private AdminView adminView;
    private UserView userView;
    private Double jumlahTransfer;
    private String pengirim;
    private String penerima;
    private Integer pinPengirim;

    public ATM( String userNama, String userPin) {
        this.fileNasabahService = new FileNasabahServiceImpl();
        this.admin = new Admin();
        this.user = new User(userNama, userPin);
        this.adminView = new AdminView();
        this.userView = new UserView();
    }

    public void login(String username, String pin) throws IOException {
        if(admin.validateCredentials(username, pin)) {
            adminView.showMenu();
        } else if (user.validateCredentials(username, pin)) {
          userView.showMenu1(username);
        }
    }
}
