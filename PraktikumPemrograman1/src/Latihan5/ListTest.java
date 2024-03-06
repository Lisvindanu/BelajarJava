/*
 * Author : Lisvindanu
 */

package Latihan5;


public class ListTest {
    public static void main(String[] args) {
        StrukturList newList = new StrukturList();
        newList.addTail(6);
        newList.addTail(1);
        newList.addMiddle(3,2);
        newList.addMiddle(5,2);
        newList.addHead(2);
        newList.displayElement();

        newList.removeMid(3);
        newList.removeMid(6);
        newList.removeMid(5);
        System.out.println();
        newList.displayElement();



//        System.out.println("Tugas a :");
//        newList.addTail(4.5);
//        newList.addMiddle(3.4,1);
//        newList.addHead(2.1);
//        newList.displayElement();
//        System.out.println();
//        System.out.println("Tugas b :");
//        newList.addTail(2.1);
//        newList.addTail(5.5);
//        newList.addMiddle(4.5,2);
//        newList.addMiddle(1.1,2);
//        newList.addHead(3.4);

    }


}
