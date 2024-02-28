/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan4;

public class StudentMain {
    public static void main(String[] args) {
        Student x = new Student();
        Student y = x;
        x.setNrp("1");
        y.setNrp("2");
        x.show();
        Student z = new Student();
        z.setNrp("3");
        x = z;
        x.show();
        y.show();
    }


}
