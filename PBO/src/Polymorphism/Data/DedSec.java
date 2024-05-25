/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Polymorphism.Data;

public abstract class DedSec {
    private String nama, skill, asal;

    public DedSec(String nama, String skill, String asal) {
        this.nama = nama;
        this.skill = skill;
        this.asal = asal;
    }

    public abstract void showDedsecMember();

    public String getNama() {
        return nama;
    }

    public String getSkill() {
        return skill;
    }

    public String getAsal() {
        return asal;
    }
}
