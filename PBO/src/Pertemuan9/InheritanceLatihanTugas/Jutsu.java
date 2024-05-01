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

package Pertemuan9.InheritanceLatihanTugas;


public class Jutsu extends Ninja{
    private String jutsu;

    public Jutsu(String jutsu, String chakra, String user  ) {
        super(chakra, user );
        setJutsu(jutsu);
    }

    public void setJutsu(String jutsu) {
        this.jutsu = jutsu;
    }

    public String getJutsu() {
        return jutsu;
    }
}
