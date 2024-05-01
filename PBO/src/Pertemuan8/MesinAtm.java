/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan8;

import java.util.Scanner;

public class MesinAtm {
    private KartuDebit kartuDebit;
    private boolean valid;

    public void init(KartuDebit kartuDebit) {
        if (kartuDebit.isValid()) {
            this.kartuDebit = kartuDebit;
            valid = true;
            System.out.println("Masukkan No. PIN");
            Scanner scan = new Scanner(System.in);
            String pinInput = scan.next();
            if(otentikasi(pinInput) == true) {
                System.out.println("Menu Utama");
            } else  {
                System.out.println("Pin tidak sesuai");
            }
        } else {
            System.out.println("Kartu Tidak Valid");
        }
    }

    private boolean otentikasi(String pinInput) {
        if(valid) {
            if(kartuDebit.getPin().equalsIgnoreCase(pinInput))
                return true;
            else
                return false;
        }
        return false;
    }
}
