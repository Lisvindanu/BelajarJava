
/*
 * Copyright (c) 2024. Create with strugle. Lisvindanu and Rafli Ramdhani
 */

package Tubes.services;

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

   void tariktunai() throws  IOException;

    void ubahPin(String username, Integer newPin) throws IOException;
    void updatePin(String username, Integer newPin);

    Double tarikTunai(String username, Double jumlah);

    void setorTunai(String username, Double jumlah);

    void topUpEwallet(String username, String noEwallet, Double jumlah, int pin);
    void bayarTokenListrik(String username, String noMeter, String noHp, Double jumlah, int pin);
    void bayarPDAM(String username, String noPelanggan, String namaPemilik, Double jumlah, int pin);
}
