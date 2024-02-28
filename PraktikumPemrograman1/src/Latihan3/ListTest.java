/*
 * Author : Lisvindanu
 */

package Latihan3;

public class ListTest {
    public static void main(String[] args) {
        StrukturList newList = new StrukturList();
        System.out.println("Latihan 4 :");
        newList.addTail(3);
        newList.addTail(4);
        newList.addTail(5);
        newList.displayElement();
        System.out.println();
//        Latihan 5 dibawah ini
        System.out.println("Latihan 5 :");
        newList.addTail(3);
        newList.addTail(2);
        newList.addTail(1);
        newList.addTail(7);
        newList.displayElement();
    }


}
