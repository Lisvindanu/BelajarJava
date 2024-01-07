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

    public void showMenu() throws IOException {
        while (true) {
            var input = InputUtil.inputString("Pilih Menu");
        }
    }
}
