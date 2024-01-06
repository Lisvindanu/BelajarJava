package TugasKelompok;

import java.io.Serializable;

public class Nasabah implements Serializable {

    private static final long serialVersionUID = 3575219631743622631L;

    private int norek;
    private String nama;
    private double saldo;

    public Nasabah(int norek, String nama, double saldo) {
        this.norek = norek;
        this.nama = nama;
        this.saldo = saldo;
    }

    public int getNorek() {
        return norek;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
