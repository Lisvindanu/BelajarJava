/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package belajar;
//Latihan
//Student x = new Student();
//Student y = x;
//x.setNrp(“01”);
//y.setNrp(“02”);
//System.out.println(x.getNrp());
//Student z = new Student();
//z.setNrp(“03”);
//x = z;
//System.out.println(x.getNrp());
//System.out.println(y.getNrp());

public class studentMain {
    public static void main(String[] args) {

        student x = new student();
        student y = x;
        x.setNrp("01");

        y.setNrp("02");
        x.show("X");
        student z = new student();
        z.setNrp("3");
        z.show("z");
        x = z;
        x.show("X");
        y.show("y");
        y = null;
        if(y != null) y.show("y");
    }

}
