/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Latihan;

public class Latihan2 {
    double Panjang, Lebar, Hasil;

    public void setPanjang(double panjang) {
        Panjang = panjang;
    }

    public void setLebar(double lebar) {
        Lebar = lebar;
    }


    void  HitungLuas (){
        Hasil = Panjang*Lebar;
    }

    void HitungKeliling (){
        Hasil = 2 * (Panjang+Lebar);
    }

    void TampilkanHasil(){
        System.out.printf("Hasilnya adalah %.2f", Hasil);
        System.out.println();
    }
    public double getHasil() {
        return Hasil;
    }
}
