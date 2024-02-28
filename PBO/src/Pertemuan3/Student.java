/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since 29-02-2024
 */

package Pertemuan3;

public class Student {
    String nrp;

    public Student() {

    }
    public void setNrp (String nrp) {
        this.nrp = nrp;
    }

    public String getNrp(){
        return nrp;
    }

    public void show(){
        System.out.println("Student index of : " + getNrp());
    }
}
