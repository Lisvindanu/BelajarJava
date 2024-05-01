/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan9.InheritanceLatihanTugas;

public class MainInheritance {
    public static void main(String[] args) {
        Jutsu jutsu = new Jutsu("RasenShuriken", "Wind", "Naruto Uzumaki");
        System.out.println("Nama Jurus : " + jutsu.getJutsu() + "-" + "Jenis chakra : " + jutsu.getChakra() + "Pengguna : " + jutsu.getuser());
    }


}
