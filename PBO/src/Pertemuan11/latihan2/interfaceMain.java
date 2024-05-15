/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan11.latihan2;

public class interfaceMain {
    public static void main(String[] args) {
        KartuElektronik kartu = new KartuElektronik("if111", "123");
        System.out.println("Otentikasi : " + kartu.otentikasi("123"));
    }
}
