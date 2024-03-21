/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan7;

public class MataKuliah {
    private String kode, nama, index;
    private int sks;

    public MataKuliah(String kode, String nama, String index, int sks) {
        super();
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }

    public int getSks(){
        return sks;
    }

    public double nilaiIndex(){
        double indexValue = 0.0;
        if(index.equalsIgnoreCase("A")) {
            indexValue  = 4.0;
        } else if (index.equalsIgnoreCase("AB")) {
            indexValue = 3.5;
        } else if (index.equalsIgnoreCase("B")) {
            indexValue = 3;
        } else if(index.equalsIgnoreCase("BC")) {
            indexValue = 2.5;
        }  else if(index.equalsIgnoreCase("BC")) {
            indexValue = 2.5;
        }  else if(index.equalsIgnoreCase("C")) {
            indexValue = 2;
        } else if(index.equalsIgnoreCase("D")) {
            indexValue = 1;
        } else {
            indexValue = 0;
            System.out.println("E");
        }
            return indexValue;
    }

    public String display(){
        return kode + " - " + nama + " - " + index;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
