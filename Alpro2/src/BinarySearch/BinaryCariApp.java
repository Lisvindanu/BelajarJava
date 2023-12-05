package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryCariApp {
    static Scanner inputan = new Scanner(System.in);

    //metode bin search berdasarkan Nama
    static int BinaryCariDariNama(BinaryCari[] arr, String x) {
        int NilaiRendah = 0;
        int NilaiTinggi = arr.length - 1;

        while (NilaiRendah <= NilaiTinggi) {
            int NilaiTengah = NilaiRendah + (NilaiTinggi-NilaiRendah) / 2;
            String NamaDiTengah = arr[NilaiTengah].GetNama();

            int BandingkanHasil = x.compareToIgnoreCase(NamaDiTengah);

            if (BandingkanHasil==0) {
                return NilaiTengah;// ketemu
            }else if(BandingkanHasil < 0){
                NilaiTinggi = NilaiTengah-1;//pindah setengah ke kiri
            }else{
                NilaiRendah = NilaiTengah + 1;// pindah setengah ke kanan
            }
        }
        return-1; //ganemu
    }

    public static void main(String[] args) {
        BinaryCari[] arr = {
                new BinaryCari("Lisvindanu", " 223040038", " A", 3.65),
                new BinaryCari("Hedi", "223040039", "B ", 3.56),
                new BinaryCari("Ilham", "223040012 ", "A ", 3.34),
                new BinaryCari("Ipin", "223040019 ", " Z", 3.99)
        };

        //urutin array berdasarkan nama sebelum binary search
        Arrays.sort(arr, (a,b) -> a.GetNama().compareToIgnoreCase(b.GetNama()) );
        System.out.println("Masukan nama yang mau dicari: ");
        String cari = inputan.nextLine();

        int hasilCari = BinaryCariDariNama(arr, cari);

        if(hasilCari != -1){
            System.out.println("ketemu di indeks ke- " + hasilCari);
            arr[hasilCari].tampil();
        }else  {
            System.out.println("Maaf gaada data 🙏");
        }
    }

}
