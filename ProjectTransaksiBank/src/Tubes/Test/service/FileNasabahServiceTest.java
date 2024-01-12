package Tubes.Test.service;

import Tubes.services.FileNasabahService;
import Tubes.services.FileNasabahServiceImpl;
import Tubes.util.InputUtil;

import java.io.IOException;

public class FileNasabahServiceTest {
    public static void main(String[] args) throws IOException {
        testShowMenu();
//        testSaveToFile();
//        testBacaFileNasabah();
//        testUpdateData();
//        testTambahRecord();
//        testHapusRecord();
    }


    public static void testShowMenu() throws IOException {
        FileNasabahService fileNasabahService = new FileNasabahServiceImpl();
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
            } else if (input.equals("5")) {
                fileNasabahService.hapusRecord();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }


    public static void testSaveToFile() {
        FileNasabahService fileNasabahService;
        fileNasabahService = new FileNasabahServiceImpl();
        try{
            fileNasabahService.saveToFile();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void testBacaFileNasabah() {
        FileNasabahService fileNasabahService = null;
        try {
            fileNasabahService.bacaFileNasabah();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testUpdateData() {
        FileNasabahService fileNasabahService = new FileNasabahServiceImpl();
        try {
            fileNasabahService.updateData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void testTambahRecord() {
        FileNasabahService fileNasabahService = new FileNasabahServiceImpl();
        try {
            fileNasabahService.tambahRecord();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void  testHapusRecord() {
        FileNasabahService fileNasabahService = new FileNasabahServiceImpl();
        try {
            fileNasabahService.hapusRecord();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
