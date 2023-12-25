package CekUmur;

import java.util.Scanner;

public class CekUmurApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jumlah Orang : ");
        int jumlahOrang = input.nextInt();
        input.nextLine();

        CekUmur[] orang = new CekUmur[jumlahOrang];

        for (int i = 0; i < jumlahOrang; i++) {
            System.out.println("orang ke : " + (i + 1));
            System.out.println("Nama : ");
            String nama = input.nextLine();

            System.out.println("Umur : ");
            int umur = input.nextInt();
            input.nextLine();

            orang[i] = new CekUmur(nama, umur);
        }


        for (CekUmur cek : orang) {
            cek.show();
            cek.cekUmur();



        }
        input.close();
    }
}
