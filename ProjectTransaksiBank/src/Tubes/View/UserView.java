/*
 * Copyright (c) 2024. Create with strugle. Lisvindanu and Rafli Ramdhani
 */

package Tubes.View;

import Tubes.services.FileNasabahService;
import Tubes.services.FileNasabahServiceImpl;
import Tubes.util.InputUtil;

import java.io.IOException;

public class UserView {
    private FileNasabahService fileNasabahService = new FileNasabahServiceImpl();

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
            } else if (input.equals("3")) {
                // Ubah PIN
                Integer newPin = InputUtil.inputInt("Masukkan PIN baru:");
                String confirmation = InputUtil.inputString("Apakah Anda yakin ingin mengubah PIN? (y/n)");

                if (confirmation.equalsIgnoreCase("y")) {
                    fileNasabahService.updatePin(username, newPin);
                    System.out.println("PIN berhasil diubah.");
                } else {
                    System.out.println("Perubahan PIN dibatalkan.");
                }
            } else if (input.equals("4")) {
                // Tarik tunai
                Double jumlah = InputUtil.inputDouble("Masukkan jumlah penarikan:");
                fileNasabahService.tarikTunai(username, jumlah);
            } else if (input.equals("5")) {
                // Setor tunai
                Double jumlah = InputUtil.inputDouble("Masukkan jumlah setoran:");
                fileNasabahService.setorTunai(username, jumlah);
            }else if (input.equals("6")) {
                // Top up e-wallet
                String noEwallet = InputUtil.inputString("Masukkan nomor e-wallet");
                Double jumlah = InputUtil.inputDouble("Masukkan jumlah top up");
                int pin = InputUtil.inputInt("Masukkan PIN Anda");
                fileNasabahService.topUpEwallet(username, noEwallet, jumlah, pin);
            } else if (input.equals("7")) {
                // Bayar token listrik
                String noMeter = InputUtil.inputString("Masukkan nomor meter");
                String noHp = InputUtil.inputString("Masukkan nomor HP");
                Double jumlah = InputUtil.inputDouble("Masukkan jumlah pembayaran");
                int pin = InputUtil.inputInt("Masukkan PIN Anda");
                fileNasabahService.bayarTokenListrik(username, noMeter, noHp, jumlah, pin);
            } else if (input.equals("8")) {
                // Bayar PDAM
                String noPelanggan = InputUtil.inputString("Masukkan nomor pelanggan");
                String namaPemilik = InputUtil.inputString("Masukkan nama pemilik");
                Double jumlah = InputUtil.inputDouble("Masukkan jumlah tagihan");
                int pin = InputUtil.inputInt("Masukkan PIN Anda");
                fileNasabahService.bayarPDAM(username, noPelanggan, namaPemilik, jumlah, pin);
            } else if (input.equals("x")) {
                // Keluar dari menu
                break;
            } else {
                System.out.println("Pilihan tidak diketahui");
            }
        }
    }
}

