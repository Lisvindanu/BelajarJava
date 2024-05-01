/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan8;

public class kelasMain {
    public static void main(String[] args) {
        KartuDebit kartu = new KartuDebit("888", "999", "333");
        MesinAtm mesinAtm = new MesinAtm();
        mesinAtm.init(kartu);
    }
}
