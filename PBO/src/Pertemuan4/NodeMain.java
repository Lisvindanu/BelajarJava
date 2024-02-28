/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan4;

public class NodeMain {
    public static void main(String[] args) {
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(5);


//    relasi antar node
        node1.setNext(node2);
        node2.setNext(node3);

//        menampilkan hasil node dengan pointer p
        Node p = node1;
        while (p != null) {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }
    }
}
