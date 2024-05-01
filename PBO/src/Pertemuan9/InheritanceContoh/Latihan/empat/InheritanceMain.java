/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan9.InheritanceContoh.Latihan.empat;

public class InheritanceMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("223040038" ,"Lisvindanu", "Bandung");
        System.out.println(mhs.getNrp() + "-" +mhs.getNama() + "-" + mhs.getAlamat());
    }
}
