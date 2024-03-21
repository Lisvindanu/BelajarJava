/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan7;



import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMataKuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMataKuliah = new ArrayList<>();
    }

    public void addMataKuliah(MataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for(MataKuliah mk : daftarMataKuliah) {
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }
    public void hitungIPS(){
        double totalNilai = 0.0;
        int totalSks = getTotalSks();
        for(MataKuliah mk : daftarMataKuliah) {
            totalNilai += mk.nilaiIndex() * mk.getSks();
        }
        if (totalSks != 0) {
            ips = totalNilai / totalSks;
        } else {
            ips = 0.0;
        }
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getIps() {
        return ips;
    }

    public void setIps(double ips) {
        this.ips = ips;
    }

    public List<MataKuliah> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }

    public void setDaftarMataKuliah(List<MataKuliah> daftarMataKuliah) {
        this.daftarMataKuliah = daftarMataKuliah;
    }
    public int getTotalSks() {
        int totalSks = 0;
        for (MataKuliah mk : daftarMataKuliah) {
            totalSks += mk.getSks();
        }
        return totalSks;
    }


}
