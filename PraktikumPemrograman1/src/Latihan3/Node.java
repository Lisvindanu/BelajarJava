/*
 * Author : Lisvindanu
 */

package Latihan3;

public class Node {
    private int data;
    private Node next;

    /*Inisialisasi atribut node*/
    public Node (int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
