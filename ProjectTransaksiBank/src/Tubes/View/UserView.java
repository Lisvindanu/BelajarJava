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

    public void showMenu1(String username ) throws IOException {
        String pengirim = username;
        fileNasabahService.menu1();
        while (true) {
            var input = InputUtil.inputString("Pilih Menu");
            if(input.equals("1")) {
                fileNasabahService.cekSaldo(username);
            } else if (input.equals("2")) {
                String penerima = InputUtil.inputString("Masukkan nama penerima:");
                double jumlahTransfer = InputUtil.inputDouble("Masukkan jumlah transfer:");
                int pinPengirim = InputUtil.inputInt("Masukkan PIN Anda:");
                fileNasabahService.transfer(pengirim, penerima, jumlahTransfer, pinPengirim);
            }else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak diketahui");
            }
        }
    }
}
