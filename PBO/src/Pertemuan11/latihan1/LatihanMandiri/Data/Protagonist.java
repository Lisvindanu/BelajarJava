/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan11.latihan1.LatihanMandiri.Data;
public class Protagonist extends persona {
    private String protagonistName;


    public Protagonist(String musuh) {
        super(musuh);
    }

    public Protagonist(String nama, String skill, String protagonistName) {
        super(nama, skill);
        this.protagonistName = protagonistName;
    }

    @Override
    public void Menyerang() {
        System.out.println(protagonistName + " Menggunakan " + nama + " untuk menyerang dengan skill " + skill);
    }


    @Override
    public void Bertahan() {
        System.out.println(protagonistName + "Bertahan dari serangan"  + musuh + " Menggunakan " + nama);
    }
}
