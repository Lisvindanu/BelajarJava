/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Latihan;

import java.util.Scanner;

public class Latihan2Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Latihan2 latihan2 = new Latihan2();
        System.out.println("Masukkan Panjang : ");
        double Panjang = Input.nextDouble();
        latihan2.setPanjang(Panjang);

        System.out.println("Masukkan Lebar : ");
        double Lebar = Input.nextDouble();
        latihan2.setPanjang(Lebar);

        System.out.println("Pilih Hasil yang ingin ditampilkan : ");
        System.out.println("1. Luas");
        System.out.println("1. Keliling");
        System.out.println("1. Keluar");
        int operasi = Input.nextInt();
        switch (operasi) {
            case 1 :
                latihan2.HitungLuas();
                break;
            case 2 :
                latihan2.HitungKeliling();
                break;
            case 3:
            default:
                System.out.println("Operasi Dibatalkan");
                break;
        }
        latihan2.TampilkanHasil();
    }


}
