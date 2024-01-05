package Tubes.Test.service;

import Tubes.services.FileNasabahService;
import Tubes.services.FileNasabahServiceImpl;

import java.io.IOException;

public class FileNasabahServiceTest {
    public static void main(String[] args) {
        testSaveToFile();
        testBacaFileNasabah();
        testUpdateData();
        testTambahRecord();
    }



    public static void testSaveToFile() {
        FileNasabahService fileNasabahService = new FileNasabahServiceImpl();
        try{
            fileNasabahService.saveToFile();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void testBacaFileNasabah() {
        FileNasabahService fileNasabahService = new FileNasabahServiceImpl();
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

}
