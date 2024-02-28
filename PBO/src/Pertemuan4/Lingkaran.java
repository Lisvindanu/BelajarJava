/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan4;

public class Lingkaran {
    int Nilai;
    public Lingkaran(int Nilai) {
        this.Nilai = Nilai;
    }

    public int getNilai(){
        return Nilai;
    }

    public void setNilai(int nilai) {
        Nilai = nilai;
    }

    public void Show(){
        System.out.println("Nilai Lingkaran : " + getNilai());
    }
}
