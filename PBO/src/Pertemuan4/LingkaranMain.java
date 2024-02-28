/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan4;

public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(5);
        Lingkaran lingkaran2 = lingkaran1;
        Lingkaran lingkaran3 = new Lingkaran(7);
        lingkaran1.Show();
        lingkaran2.Show();
        lingkaran3.Show();
        lingkaran2.setNilai(8);
        lingkaran1.Show();
        lingkaran2.Show();
        lingkaran3.Show();
        lingkaran2 = lingkaran3;
        lingkaran1.Show();
        lingkaran2.Show();
        lingkaran3.Show();
        lingkaran2 = null;
        lingkaran1.Show();
        if(lingkaran2 != null) lingkaran2.Show();
        lingkaran3.Show();
        ubahNilai(lingkaran1);
        lingkaran1.Show();
    }

    public static void ubahNilai(Lingkaran obj) {
        obj.setNilai(100);
    }
}
