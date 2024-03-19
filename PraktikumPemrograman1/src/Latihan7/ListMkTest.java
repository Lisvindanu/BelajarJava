/*
 * Author : Lisvindanu
 */

package Latihan7;

public class ListMkTest {
    public static void main(String[] args) {
//        ListMataKuliah list1 = new ListMataKuliah();
//
//        list1.addHead(new Matakuliah("IF001", "Dasar Pemrograman", 4));
//        list1.addHead(new Matakuliah("IF001", "Pemrograman Web", 2));
//        list1.displayElement();
//
        ListMataKuliah list2 = new ListMataKuliah();
        list2.addTail(new Matakuliah("If002", "PP2", 3));
        list2.addTail(new Matakuliah("If003", "PP4", 3));
        list2.addMiddle(new Matakuliah("if005", "pp3", 3), 1 );
        list2.addHead(new Matakuliah("If004", "PP1", 3));

        list2.displayElement();
    }
}
