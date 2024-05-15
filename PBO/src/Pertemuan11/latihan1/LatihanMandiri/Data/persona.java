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

/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan11.latihan1.LatihanMandiri.Data;

public abstract class persona {
    protected String nama;
    protected String skill;

    protected String musuh;

    public persona(String musuh) {
        this.musuh = musuh;
    }
    public persona(String nama, String skill) {
        this.nama = nama;
        this.skill = skill;
    }

    public abstract void Menyerang();
    public abstract void Bertahan();

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
    public String getMusuh() {
        return musuh;
    }
    public void setMusuh(String musuh) {
        this.musuh = musuh;
    }
}
