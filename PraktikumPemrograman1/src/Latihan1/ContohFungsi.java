/*
 * Author : Lisvindanu
 */

package Latihan1;/*
 * Author : Lisvindanu
 */

public class ContohFungsi {

    //    membuat fungsi operasi matematik yang diberi nama tambah dengan parameter yang tipe data nya int, dan parameter nya diberi nama a dan b, kemudian mengembalikan hasil a ditambah b
    public static int tambah(int a, int b) {
        return a+b;
    }
    //    membuat fungsi operasi matematik yang diberi nama kali dengan parameter yang tipe data nya int, dan parameter nya diberi nama a dan b, kemudian mengembalikan hasil a dikali b
    public static int kali(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {
        //    membuat variabel denagn tipe data int yang diberi nama hasilPenjumlahan yang memanggil fungsi tambah dengan input parameter 5 untuk a dan 3 untuk b kemudian hasil di print dengan System.out.print yang memanggil kembali variable tersebut yang telah mendapatkan hasil dari fungsi tambah
        int hasilPenjumlahan = tambah(5, 3);
        System.out.println("Hasil penjumlahan " + hasilPenjumlahan);
        //    membuat variabel denagn tipe data int yang diberi nama hasilPerkalian yang memanggil fungsi kali dengan input parameter 4 untuk a dan 6 untuk b kemudian hasil di print dengan System.out.print yang memanggil kembali variable tersebut yang telah mendapatkan hasil dari fungsi kali
        int hasilPerkalian = kali(4,6);
        System.out.println("Hasil perkalian " + hasilPerkalian);
    }



}
