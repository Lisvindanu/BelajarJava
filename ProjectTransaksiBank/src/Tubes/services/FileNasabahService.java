package Tubes.services;

import java.io.FileNotFoundException;
import java.io.IOException;
public interface FileNasabahService {

    void showMenu();
    void saveToFile() throws IOException;

    void bacaFileNasabah() throws IOException;

    void updateData() throws IOException;

    void tambahRecord() throws IOException;
    void tambahRecord2() throws IOException;

    void hapusRecord() throws IOException;
}
