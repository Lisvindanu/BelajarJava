/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan11.latihan1;

public class abstractMainApp {
    public static void main(String[] args) {
     Lingkaran lingkaran = new Lingkaran(10);
        System.out.println("== Lingkaran ==");
        System.out.println("Jari2 : "+ lingkaran.getJari2());
        System.out.println("Luas : " + lingkaran.luas());

        Tabung tabung = new Tabung(10, 5);
        System.out.println("== Tabung ==");
        System.out.println("Jari2 : " +tabung.getJari2() + "," + "Tinggi : " + tabung.getTinggi());
        System.out.printf("Luas : %.10f", tabung.luas());
    }
}
