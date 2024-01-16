/*
 * Copyright (c) 2024. Create with strugle. Lisvindanu and Rafli Ramdhani
 */

package Tubes.View;

import Tubes.services.FileNasabahService;
import Tubes.Test.service.FileNasabahServiceTest;
import Tubes.util.InputUtil;

import java.io.IOException;

public class NasabahView {
    private FileNasabahService fileNasabahService;

    public  NasabahView(FileNasabahService fileNasabahService) {
        this.fileNasabahService = fileNasabahService;
    }

    public void NasabahView() throws IOException {
        while (true) {
            fileNasabahService.showMenu();

            var input = InputUtil.inputString("Pilih");

            if(input.equals("1")){
                fileNasabahService.saveToFile();
            } else if (input.equals("2")){
                fileNasabahService.bacaFileNasabah();
            } else if (input.equals("3")) {
                fileNasabahService.updateData();
            } else if (input.equals("4")) {
                fileNasabahService.tambahRecord();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }

    }

    public void saveToFile() throws IOException {
        System.out.println("Menambah Data");

        var temp = InputUtil.inputString("Tambah Data (x jika batal)");

        if (temp.equals("x")) {
        }else {
            fileNasabahService.saveToFile();
        }
    }
}
