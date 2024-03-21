/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Latihan;

import Pertemuan5.MataKuliah;

public class MatakuliahMain {
    public static void main(String[] args) {
        Matakuliah mk1 = new Matakuliah("001", "Alpro 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Alpro 2", "A", 3);
        Matakuliah mk3 = new Matakuliah("003", "PBO", "A", 3);

        System.out.println("DAFTAR MATKUL");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        System.out.println("Nilai Ipk");
        //rumusnya adalah total_nilai / total_sks
        int total_sks = mk1.getSks() + mk2.getSks() + mk3.getSks();
        double total_nilai = mk1.indexNilai() + mk2.indexNilai() + mk3.indexNilai();
        double ipk = total_nilai / total_sks;


        System.out.println("total sks : " + total_sks);
        System.out.println("Total nilai  " + total_nilai);
        System.out.println("Nilai ipk : " + ipk);
    }
}
