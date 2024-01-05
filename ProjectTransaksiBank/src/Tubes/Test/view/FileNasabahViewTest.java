package Tubes.Test.view;

import Tubes.Test.service.FileNasabahServiceTest;
public class FileNasabahViewTest {
    public static void main(String[] args) {
        System.out.println("test 1");
        FileNasabahServiceTest.testSaveToFile();
        System.out.println("test 2");
        FileNasabahServiceTest.testBacaFileNasabah();
        System.out.println("test 3");
        FileNasabahServiceTest.testUpdateData();
        System.out.println("test 4");
        FileNasabahServiceTest.testTambahRecord();
    }
}
