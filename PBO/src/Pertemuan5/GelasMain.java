/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan5;

public class GelasMain {
    public static void main(String[] args) {
        Gelas g1 = new Gelas("Hitam");
        Gelas g2 = new Gelas("Biru");

        tukarWarnaGelas(g1,g2);
        g1.show("g1");
        g2.show("g2");
    }

    static void tukarWarnaGelas(Gelas g1, Gelas g2) {
        Gelas gtemp = new Gelas("temp");
        gtemp.setWarna(g1.getWarna());
        g1.setWarna(g2.getWarna());
        g2.setWarna(gtemp.getWarna());
    }
}
