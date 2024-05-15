/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan11.latihan2;

public class KartuElektronik implements kartu{
    private String kodeBank, pin;

    public KartuElektronik(String kodeBank, String pin) {
        super();
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    @Override
    public boolean otentikasi(String pinInput) {
        if(pin.equals(pinInput))
            return true;
            else
                return false;
        }

    @Override
    public String encode(String pin) {
        return null;
    }
}

