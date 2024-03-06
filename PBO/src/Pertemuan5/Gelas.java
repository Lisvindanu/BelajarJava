/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan5;

public class Gelas {
    private String warna;

    public Gelas(String warna) {
        this.warna = warna;
    }

    void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna(){
        return warna;
    }

    public void show(String namaVar){
        System.out.println("Warna " +  namaVar + " " + getWarna());
    }
}
