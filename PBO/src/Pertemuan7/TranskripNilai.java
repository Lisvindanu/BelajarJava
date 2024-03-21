/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    public double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    TranskripNilai(Mahasiswa mahasiswa) {
        super();
        this.mahasiswa = mahasiswa;
        kartuHasilStudi = new ArrayList<KartuHasilStudi>();
        tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalNilai = 0.0;
        int totalSks = 0;
        for (KartuHasilStudi khs : kartuHasilStudi) {
            totalNilai += khs.getIps() * khs.getTotalSks();
            totalSks += khs.getTotalSks();
        }
        if (totalSks != 0) {
            ipk = totalNilai / totalSks;
        } else {
            ipk = 0.0;
        }
    }

    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak : " + tglCetak.toString());
        System.out.println("ipk: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }

    public Date getTglCetak() {
        return tglCetak;
    }

    public void setTglCetak(Date tglCetak) {
        this.tglCetak = tglCetak;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public List<KartuHasilStudi> getKartuHasilStudi() {
        return kartuHasilStudi;
    }

    public void setKartuHasilStudi(List<KartuHasilStudi> kartuHasilStudi) {
        this.kartuHasilStudi = kartuHasilStudi;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}
