/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan8;

public class KartuDebit {
    private String kodeBank, noRekening, pin;
    public boolean valid;
    public KartuDebit(String kodeBank, String noRekening, String pin) {
        super();
        this.kodeBank = kodeBank;
        this.noRekening = noRekening;
        this.pin = pin;
        this.valid = true;
    }

    public String getKodeBank() {
        return kodeBank;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getPin() {
        return pin;
    }

    public boolean isValid() {
        return valid;
    }
}
