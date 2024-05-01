/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan9.InheritanceLatihanTugas;

public class Ninja {
    protected String chakra, user;

    public Ninja(String chakra, String user ) {
        this.chakra = chakra;
        this.user = user;
    }

    public String getChakra() {
        return chakra;
    }

    public String getuser() {
        return user;
    }
}
