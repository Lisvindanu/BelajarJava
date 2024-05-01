/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan9.InheritanceContoh.Latihan.tiga;

public class Orang {
    protected String nama, alamat;

    public Orang(String nama, String alamat) {
       this.nama = nama;
       this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}
