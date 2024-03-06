/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package belajar;

import Pertemuan4.Student;

public class student {
    private String nrp;

    public  student(){

    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }
    public String getNrp() {
        return nrp;
    }

    public void show(String namaVar) {
        System.out.println("Index untuk variable " + namaVar + ", Nilai : "+ getNrp());
    }

}
