/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan4;

public class Node {
    private int nilai;
    private Node node;



    //        inisialisasi constructor node
    public Node(int nilai) {
        this.nilai = nilai;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public Node getNext() {
        return node;
    }

    public void setNext(Node next) {
        this.node = next;
    }
}
