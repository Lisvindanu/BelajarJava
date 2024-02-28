/*
 * Author : Lisvindanu
 */

package Latihan1;/*
 * Author : Lisvindanu
 */

public class NodeMain {
    public static void main(String[] args) {

        //membuat dua buah node n1 dan n2
        Node n1 = new Node(5);
        Node n2 = new Node(7);
        Node n3 = new Node(9);
        Node n4 = new Node(8);

        // membuat relasi Latihan1.Node n1 dan n2
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

//        menampilkan Latihan1.Node n1 & n2 dengan pointer P
        Node p = n1;
        while (p != null) {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }
    }
}