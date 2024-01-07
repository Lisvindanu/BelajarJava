package Tubes.View;

import Tubes.Entity.Admin;
import Tubes.services.FileNasabahService;
import Tubes.services.FileNasabahServiceImpl;
import Tubes.util.InputUtil;

import java.io.IOException;

public class UserView {
    private FileNasabahService fileNasabahService = new FileNasabahServiceImpl();

    public UserView() {
        this.fileNasabahService = new FileNasabahServiceImpl();
    }

    public void showMenu1(String username) throws IOException {
        fileNasabahService.menu1();
        while (true) {
            var input = InputUtil.inputString("Pilih Menu");
            if(input.equals("1")) {
                fileNasabahService.cekSaldo(username);
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak diketahui");
            }
        }
    }
}
