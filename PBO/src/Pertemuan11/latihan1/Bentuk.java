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

public abstract class Bentuk {
    protected double PHI = 3.14;
    protected int jari2;

    public Bentuk(int jari2) {
        super();
        this.jari2 = jari2;
    }

    public abstract double luas();

    public double getPHI() {
        return PHI;
    }

    public void setPHI(double PHI) {
        this.PHI = PHI;
    }

    public int getJari2() {
        return jari2;
    }

    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }


}
