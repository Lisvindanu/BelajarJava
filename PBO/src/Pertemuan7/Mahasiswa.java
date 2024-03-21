/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan7;

public class Mahasiswa {
    private String Nrp, nama;

    public Mahasiswa() {

    }
    public Mahasiswa(String nrp, String nama) {
        super();
        Nrp = nrp;
        this.nama = nama;
    }

    public String getNrp() {
        return Nrp;
    }

    public void setNrp(String nrp) {
        Nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String display() {
        return "Nrp : " + Nrp + ", nama: " + nama;
    }
}
