/*
 * Copyright (c) 2024. Create with strugle. Lisvindanu and Rafli Ramdhani
 */

package Tubes.View;

import Tubes.services.FileNasabahService;
import Tubes.services.FileNasabahServiceImpl;
import Tubes.util.InputUtil;

import java.io.IOException;

public class AdminView {
    private FileNasabahService fileNasabahService = new FileNasabahServiceImpl();
    public AdminView(){
        this.fileNasabahService = new FileNasabahServiceImpl();
    }
    public void showMenu() throws IOException {
        while (true) {
            fileNasabahService.showMenu();

            var input = InputUtil.inputString("Pilih Menu");
            if(input.equals("1")){
                fileNasabahService.saveToFile();
            } else if (input.equals("2")){
                fileNasabahService.bacaFileNasabah();
            } else if (input.equals("3")) {
                fileNasabahService.updateData();
            } else if (input.equals("4")) {
                fileNasabahService.tambahRecord();
            } else if (input.equals("5")) {
                fileNasabahService.hapusRecord();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }

        }
    }

}
