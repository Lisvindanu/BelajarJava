/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan9.InheritanceContoh.Latihan.tiga;

public class InheritanceMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Lisvindanu", "Bandung");
        System.out.println(mhs.getNama() + "-" + mhs.getAlamat());
    }
}
