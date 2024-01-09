/*
 * Copyright (c) 2024. Create with strugle. Lisvindanu
 */

package Tubes.services;

import java.io.FileNotFoundException;
import java.io.IOException;
public interface FileNasabahService {

    void showMenu();
    void saveToFile() throws IOException;

    void bacaFileNasabah() throws IOException;

    void updateData() throws IOException;

    void tambahRecord() throws IOException;
    void menu1() throws IOException;

    void hapusRecord() throws IOException;
    void cekSaldo(String username) throws IOException;

    void transfer(String pengirim, String penerima, Double jumlahTransfer, Integer pinPengirim) throws IOException;
}
