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

package Pertemuan11.latihan1;

public class Lingkaran extends Bentuk{
    public Lingkaran(int jari2) {
        super(jari2);
    }

    @Override
    public double luas() {
        return PHI*jari2*jari2;
    }
}
